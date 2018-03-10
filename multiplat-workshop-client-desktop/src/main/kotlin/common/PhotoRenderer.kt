package common

import model.Photo

actual object PhotoRenderer {
    actual fun render(photos: List<Photo>) {
        println(photos)
    }
}