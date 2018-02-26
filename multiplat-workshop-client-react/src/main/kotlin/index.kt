import kotlinx.coroutines.experimental.async

fun main(args: Array<String>){
    println("starting")
    val photoProvider = PhotoProvider()
    val deferred = async { photoProvider.fetchAndDisplayPhotos(CommonPhotoHandler) }
    println("ending")
}