actual class PhotoDisplayer {
    actual fun render(photos: List<Photo>) {
        photos.forEach(::println)
    }
}