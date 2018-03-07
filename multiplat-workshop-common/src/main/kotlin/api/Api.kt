package api
class ApiClient{
    fun fetchPhotos(): String{
        return "photos"
    }
}

const val PHOTO_URL = "https://api.meetup.com/Dublin-Kotliners/events/243009138/photos?&sign=true&photo-host=public&page=20&photo-host=public&page=20"