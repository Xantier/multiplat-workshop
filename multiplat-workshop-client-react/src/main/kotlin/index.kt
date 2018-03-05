import client.PhotoProvider
import common.PhotoDisplayer
import common.PhotoHandler
import kotlinx.coroutines.experimental.launch

fun main(args: Array<String>) {
    val photoProvider = PhotoProvider()
    launch {
        val photos = photoProvider.fetchPhotos(PhotoHandler())
        PhotoDisplayer.render(photos)
    }
}