package common

import model.Photo

expect object PhotoRenderer{
    fun render(photos: List<Photo>)
}