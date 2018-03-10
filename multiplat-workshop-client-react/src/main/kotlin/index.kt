import common.ApiClientProvider

fun main(args: Array<String>){
    val photoProvider = PhotoProvider()
    photoProvider.fetchPhotos(ApiClientProvider())
}