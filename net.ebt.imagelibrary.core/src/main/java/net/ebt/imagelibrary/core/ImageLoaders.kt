package net.ebt.imagelibrary.core

import java.io.File

class ImageLoaders(val root: File) {

    private val loaders = mutableListOf<ImageLoader>()

    fun add(loader: ImageLoader) {
        loaders.add(loader)
        loader.run()
    }

    fun load() {
        add(ImageLoader(this, root))
    }
}