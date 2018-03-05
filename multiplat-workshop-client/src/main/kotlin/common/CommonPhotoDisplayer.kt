package common

import model.Photo

expect object PhotoDisplayer {
    fun render(photos: List<Photo>)
}