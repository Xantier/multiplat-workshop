
fun main(args: Array<String>){
    val client = ApiClient()
    println("Starting fetch")
    client.fetchPhotos()
    println("Ending fetch")
}