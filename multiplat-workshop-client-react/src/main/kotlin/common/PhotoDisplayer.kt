package common

import model.Photo
import view.reactPhotoComponent
import kotlin.browser.document

actual object PhotoDisplayer {
    actual fun render(photos: List<Photo>) {
        react.dom.render(document.getElementById("root")) {
            reactPhotoComponent(photos)
        }
    }
}