/**
 * Created by z0027x3m on 21.03.2016.
 */

fun main(args: Array<String>){
    println("Refactoring Kotlin Edition")

    var customer = Customer("Sanchez")

    customer.addRental(Rental(Movie("Lion King", 2), 2))

    customer.addRental(Rental(Movie("Aladdin", 2), 3))

    customer.addRental(Rental(Movie("Rambo", 0), 3))

    customer.addRental(Rental(Movie("Star Wars Ep. VII", 0), 2))

    println(customer.statement())

}

