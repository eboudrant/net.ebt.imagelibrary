package net.ebt.imagelibrary.core

import junit.framework.TestCase
import org.junit.Test
import java.io.File

class ImageLoadersTest : TestCase() {


    @Test
    fun testLoad() {
        ImageLoaders(File("/Users/eboudrant/Pictures/2018")).load()
        ImageLoaders(File("/Volumes/photos/")).load()
//        ImageLoader.generateClasses()
    }
}