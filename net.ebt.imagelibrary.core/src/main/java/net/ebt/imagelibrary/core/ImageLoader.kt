package net.ebt.imagelibrary.core

import java.io.File
import com.drew.imaging.ImageMetadataReader
import com.drew.imaging.ImageProcessingException
import com.drew.metadata.Tag
import net.ebt.imagelibrary.exif.Directories

class ImageLoader(val imageLoaders: ImageLoaders, val root: File) {

    companion object {
        private var counter = 0
        private val max = 10000
        private val connterByExt = mutableMapOf<String, Int>()
        private val directories = mutableMapOf<String, MutableMap<String, Tag>>()

        fun generateClasses() {
            directories.forEach { entry ->
                var fields = ""
                val tags = entry.value
                tags.forEach {
                    val tag = it.value
                    fields += """
                // ${tag.description} / ${tag.tagType}
                val ${tag.tagName.asClassName()} = "${tag.tagName}"
"""
                }
                val clazz = """
            object ${entry.key.replace(" ", "")} {

              val name = "${entry.key}"
              $fields
            }
""".trimIndent()
                System.out.println(clazz)
            }
        }

        private fun String.asClassName(): String {
            return toUpperCase()
                    .replace(' ', '_')
                    .replace('\\', '_')
                    .replace('(', '_')
                    .replace(')', '_')
                    .replace('/', '_')
                    .replace('-', '_')
        }
    }

    fun run() {
        root.list { parent, name ->
            if (counter > max) {
                return@list true
            }
            val file = File(parent, name)
            if (file.isDirectory) {
                imageLoaders.add(ImageLoader(imageLoaders, file))
            } else {
                add(file)
                counter++
            }
            true
        }
    }

    data class Photo(
            var size: String? = null,
            var camera: String? = null,
            var path: String? = null,
            var date: String? = null,
            var lens: String? = null
    )

    fun add(file: File) {
        val photo = Photo(size = file.humanSize())
        when (file.extension.toLowerCase()) {
            "dng", "cr2", "jpg" -> {
                try {
                    val metadata = ImageMetadataReader.readMetadata(file)
                    var dateFound = false
                    metadata.directories.forEach { dir ->
                        val tags: MutableMap<String, Tag> = directories[dir.name] ?: mutableMapOf<String, Tag>().apply {
                            directories[dir.name] = this
                        }
                        dir.tags.forEach { tag ->
                            tags[tag.tagName] = tag
                        }
                        when (dir.name) {
                            Directories.ExifIFD0.name -> {
                                dir.tags.forEach { tag ->
                                    when (tag.tagName) {
                                        Directories.ExifIFD0.DATE_TIME_ORIGINAL, Directories.ExifIFD0.DATE_TIME -> {
                                            if (!dateFound && tag.description != "0000:00:00 00:00:00") {
                                                photo.date = tag.description
                                                dateFound = true
                                            }
                                        }
                                        Directories.ExifIFD0.MODEL -> {
                                            photo.camera = tag.description
                                        }
                                    }
                                }
                            }
                            Directories.ExifSubIFD.name -> {
                                dir.tags.forEach { tag ->
                                    when (tag.tagName) {
                                        Directories.ExifSubIFD.DATE_TIME_ORIGINAL, Directories.ExifSubIFD.DATE_TIME_DIGITIZED -> {
                                            if (!dateFound && tag.description != "0000:00:00 00:00:00") {
                                                photo.date = tag.description
                                                dateFound = true
                                            }
                                        }
                                    }
                                }
                            }
                            Directories.LeicaMakernote.name -> {
                                dir.tags.forEach { tag ->
                                    when (tag.tagName) {
                                        Directories.LeicaMakernote.SERIAL_NUMBER -> {
                                            photo.lens = tag.description
                                        }
                                    }
                                }
                            }
                            Directories.CanonMakernote.name -> {
                                dir.tags.forEach { tag ->
                                    when (tag.tagName) {
                                        Directories.CanonMakernote.LENS_TYPE -> {
                                            photo.lens = tag.description
                                        }
                                    }
                                }
                            }
                        }
                    }
                    System.out.println("#$counter $photo")
                } catch (e: ImageProcessingException) {
                    // pass it
                    System.out.println("#$counter INVALID $photo")
                }
            }
            else -> {

            }
        }
    }
}

private fun File.humanSize(): String? {
    if ((length() / 1024 / 1024) == 0L) {
        return "${length() / 1024}Kb"
    } else {
        return "${length() / 1024 / 1024}Mb"
    }
}
