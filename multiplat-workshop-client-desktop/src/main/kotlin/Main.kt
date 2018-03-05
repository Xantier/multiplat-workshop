import client.PhotoProvider
import common.PhotoDisplayer
import common.PhotoHandler
import kotlinx.coroutines.experimental.runBlocking

fun main(args: Array<String>) {
    val photoProvider = PhotoProvider()
    runBlocking {
        val photos = photoProvider.fetchPhotos(PhotoHandler())
        PhotoDisplayer.render(photos)
    }
}