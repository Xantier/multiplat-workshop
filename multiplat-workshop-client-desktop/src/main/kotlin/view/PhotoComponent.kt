package view

import client.PhotoProvider
import common.PhotoHandler
import javafx.scene.control.ScrollPane
import kotlinx.coroutines.experimental.runBlocking
import model.Photo
import tornadofx.App
import tornadofx.View
import tornadofx.imageview
import tornadofx.vbox

class HelloWorld : View() {
    private val photos: List<Photo> by lazy {
        val photoProvider = PhotoProvider()
        runBlocking {
            return@runBlocking photoProvider.fetchPhotos(PhotoHandler())
        }
    }
    override val root = ScrollPane()

    init {
        with(root) {
            prefWidth = 800.0
            prefHeight = 600.0
            vbox {
                photos.forEach {
                    imageview(it.photo_link) {
                        scaleX = .50
                        scaleY = .50
                    }
                }
            }
        }
    }
}

class HelloWorldApp : App() {
    override val primaryView = HelloWorld::class
}