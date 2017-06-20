/**
 * Created by aashish.tamsya on 20/06/17.
 */

fun main(ars: Array<String>) {

    val myName = "Aashish Tamsya"

    val longString = """This is a long

string"""

    var firstName: String = "John"
    var lastName: String = "Smith"

    lastName = "Doe"

    var fullName = firstName + " " + lastName

    println("Full Name : $fullName\n")

    println("1 + 2 = ${ 1 + 2}\n")

    println("Length of Full Name\t:\t${fullName.length}")

    // Compare strings

    var stopString = "Stop"
    var startString = "Start"

    println("Are strings equal?\t:\t${stopString.equals(startString)}")

    println("Compare Char\t\t-\tA to B : ${ 'A'.compareTo('B')}")
    println("Compare String\t\t-\tA to B : ${ "A".compareTo("B")}\n")

    // Get Character at particular index
    // Make sure your index should be less than n-1, where n is the length of the string
    val index = 4
    val string = "ABCDEFGHIJ"
    val character = 'G'

    println("Character at $index\t\t:\t${string[index]}")    // E, Since index start from 0

    println("Index of $character\t\t\t:\t${string.indexOf(character)}")

    println("Index from 2 to 7\t:\t${string.subSequence(2,8)}\n")  // Why 8?, Since index start from 0

    // Check if a string contains another string

    val mainString = "This is a string sample to check if a string contains another string"

    println("Main String\t\t:\t$mainString")
    println("Contains random\t:\t${mainString.contains("random")}")
    println("Contains sample\t:\t${mainString.contains("sample")}")
}