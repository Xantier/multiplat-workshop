import kotlinx.coroutines.experimental.runBlocking

fun main(args: Array<String>) {
    val photoProvider = PhotoProvider()
    runBlocking {
        val photos = photoProvider.fetchAndDisplayPhotos(PhotoHandler())
        photos.forEach(::println)
    }
}