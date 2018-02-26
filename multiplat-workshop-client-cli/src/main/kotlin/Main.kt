import kotlinx.coroutines.experimental.runBlocking

fun main(args: Array<String>) {
    val photoProvider = PhotoProvider()
    runBlocking {photoProvider.fetchAndDisplayPhotos(CommonPhotoHandler)}
}