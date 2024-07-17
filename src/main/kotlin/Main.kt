package org.example

//fun main() {
//    birthdayGreeting()
//}
//
//fun birthdayGreeting() {
//    println("Happy Birthday, Rover!")
//    println("You are now 5 years old!")
//}

//fun main() {
//    birthdayGreeting()
//}
//
//fun birthdayGreeting(): Unit {
//    println("Happy Birthday, Rover!")
//    println("You are now 5 years old!")
//}

//fun main() {
//    println(birthdayGreeting())
//}
//
//fun birthdayGreeting(): String {
//    val nameGreeting = "Happy Birthday, Rover!"
//    val ageGreeting = "You are now 5 years old!"
//    return "$nameGreeting\n$ageGreeting"
//}

//fun main() {
//    println(birthdayGreeting("Rover"))
//    println(birthdayGreeting("Rex"))
//}

//fun birthdayGreeting(name: String): String {
//    val nameGreeting = "Happy Birthday, $name!"
//    val ageGreeting = "You are now 5 years old!"
//    return "$nameGreeting\n$ageGreeting"
//}

//fun birthdayGreeting(name: String, age: Int): String {
//    val nameGreeting = "Happy Birthday, $name!"
//    val ageGreeting = "You are now $age years old!"
//    return "$nameGreeting\n$ageGreeting"
//}
//
//fun main() {
//    println(birthdayGreeting("Rover", 5))
//    println(birthdayGreeting( age = 2 ,name ="Rex" ))
//}

fun birthdayGreeting(name: String = "Rover", age: Int): String {
    return "Happy Birthday, $name! You are now $age years old!"
}


