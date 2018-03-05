package common

import model.Photo
import tornadofx.launch
import view.PhotoComponent
import view.TornadoApplication

actual object PhotoDisplayer {
    actual fun render(photos: List<Photo>) {
        PhotoComponent.photos = photos
        launch<TornadoApplication>()
    }
}