import common.ApiClientProvider
import kotlinx.coroutines.experimental.launch

fun main(args: Array<String>){
    val photoProvider = PhotoProvider()
    launch {
        photoProvider.fetchAndRenderPhotos(ApiClientProvider())
    }
}