package common

import model.Photo

actual class PhotoDisplayer {
    actual fun render(photos: List<Photo>) {
        photos.forEach(::println)
    }
}