package view

import javafx.scene.control.ScrollPane
import model.Photo
import tornadofx.App
import tornadofx.View
import tornadofx.imageview
import tornadofx.vbox

class PhotoComponent : View() {
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

    companion object {
        var photos = listOf<Photo>()
    }
}

class TornadoApplication : App() {
    override val primaryView = PhotoComponent::class
}
