/**
 * Created by z0027x3m on 21.03.2016.
 */

data class Customer(val name: String, val email: String)

fun main(args: Array<String>){
    println("Hello from Kotlin")

    val current = Customer(name = "Sergio", email = "srsanchez75@yahoo.de")
    println(current)

    val numbers = arrayListOf(1,2,3,4,5,6)

    val even = numbers.filter { it % 2 == 0 }

    println("even numbers are $even")

    val countriesCities = listOf(Pair("England","London"), Pair("France","Paris"), Pair("Germany","Berlin"))

    for((country, city) in countriesCities){
        println("Country: $country, City: $city")
    }


}

