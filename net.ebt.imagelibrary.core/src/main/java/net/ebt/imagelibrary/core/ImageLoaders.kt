package net.ebt.imagelibrary.core

import java.io.File

class ImageLoaders(private val root: File) {

    private val loaders = mutableListOf<ImageLoader>()

    init {
        System.out.println("Loading $root")
    }

    fun add(loader: ImageLoader) {
        loaders.add(loader)
        loader.run()
    }

    fun load() {
        add(ImageLoader(this, root))
    }
}