import common.ApiClientProvider
import kotlinx.coroutines.experimental.runBlocking

fun main(args: Array<String>) {
    val photoProvider = PhotoProvider()
    runBlocking {
        photoProvider.fetchAndRenderPhotos(ApiClientProvider())
    }
}