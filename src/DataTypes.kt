/**
 * Created by aashish.tamsya on 19/06/17.
 */

package demo

fun main(args: Array<String>) {

    val name = "Aashish"

    var myAge = 24

    var bigInt: Int = Int.MAX_VALUE
    var smallInt: Int = Int.MIN_VALUE

    println("Biggest Int\t:\t" + bigInt)
    println("Smallest Int : $smallInt")

    var bigLong = Long.MAX_VALUE
    var smallLong = Long.MIN_VALUE

    println("Biggest Long :" + bigLong)
    println("Smallest Long : $smallLong")

    var bigDouble = Double.MAX_VALUE
    var smallDouble = Double.MIN_VALUE

    println("Biggest Double :" + bigDouble)
    println("Smallest Double : $smallDouble")

    var bigFloat = Float.MAX_VALUE
    var smallFloat = Float.MIN_VALUE

    println("Biggest Float :" + bigFloat)
    println("Smallest Float : $smallFloat")

    // Loss of precession
    var doubleNumberOne: Double = 1.1111111111111111
    var doubltNumberTwo: Double = 1.1111111111111111

    // Precession fails after 15th decimal points in floating number
    println("Sum :" + (doubleNumberOne + doubltNumberTwo))

    if (true is Boolean) {
        print("true is Boolean\n")
    }

    var character = 'A'

    println("A is a character : ${character is Char}")

}