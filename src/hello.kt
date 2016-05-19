/**
 * Created by z0027x3m on 21.03.2016.
 */

fun main(args: Array<String>){
    println("Refactoring Kotlin Edition")

    testRentals()



    val pinkFloyd = listOf(
            Album("The Dark Side of the Moon", 1973, 2, 1,
                    listOf(Track("Speak to Me", 90),
                            Track("Breathe", 163),
                            Track("On he Run", 216),
                            Track("Time", 421),
                            Track("The Great Gig in the Sky", 276),
                            Track("Money", 382),
                            Track("Us and Them", 462),
                            Track("Any Color You Like", 205),
                            Track("Brain Damage", 228),
                            Track("Eclipse", 123)
                    )
            ))

    var summary = nameAndTotalTime_v1(pinkFloyd)

    println( summary)


    // var totalDuration = firstAlbum.tracks.reduce { track, track -> track.durationInSeconds  }
}

fun nameAndTotalTime_v1(albums: List<Album>) : List<Pair<String, Int>>
{
    return albums.map {
        Pair(it.title, it.tracks.map { it.durationInSeconds }.reduce { sum, itemDuration -> sum + itemDuration } )
    }
}

data class Track(val title: String, val durationInSeconds: Int)

data class Album(val title: String, val year: Int, val x: Int, val y: Int, val tracks: List<Track>) {
}

private fun testRentals() {
    var customer = Customer("Sanchez")

    customer.addRental(Rental(Movie("Lion King", 2), 2))

    customer.addRental(Rental(Movie("Aladdin", 2), 3))

    customer.addRental(Rental(Movie("Rambo", 0), 3))

    customer.addRental(Rental(Movie("Star Wars Ep. VII", 0), 2))

    println(customer.statement())
}

