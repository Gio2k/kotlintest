class Movie(val title: String, var priceCode: Int) {
    companion object {
        val CHILDREN = 2
        val REGULAR = 0
        val NEW_RELEASE = 1
    }
}