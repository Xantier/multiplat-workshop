actual object CommonPhotoHandler {
    actual fun getApiClient(): ApiClient {
        return ApiClient()
    }

    actual fun render(photos: List<Photo>) {
        println("Showing photos")
    }
}