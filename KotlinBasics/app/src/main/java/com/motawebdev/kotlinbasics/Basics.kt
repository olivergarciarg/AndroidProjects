package com.motawebdev.kotlinbasics

fun main() {
//    val number1 = 1
//
//    var myAge: Byte = 35
//    println(myAge)
//    myAge = 36
//
//    println(myAge)
//    val pi = 3.14f
//    println(pi)

//    var age: UShort = 35u
//    println(age)
//    val myTrue: Boolean = true
//    val myFalse: Boolean = false
//
//    println(myTrue || myFalse)
//    println(myTrue && myFalse)
//    println(!myTrue)
//    println(!myFalse)
//    var myChar: Char = 'a'
//    println(myChar)
//    myChar = '\u00AE'
//    println(myChar)
//    myChar = '\\'
//    println(myChar)
//    var name = "Denis"
//    var firstName = "Denis"
//    var lastName = "Panjuta"
//    println(name.lowercase())
//    println(name.uppercase())
//    println(name + " Panjuta")
//    println(firstName + "\n" +lastName)
    var age = 0
    age = readln().toInt()
    if (age >= 21) {
        println("Now you may drink in the US")
    } else if (age >= 18) {
        println("You may vote now")
    } else if (age >= 16) {
        println("You may drive now")
    } else {git
        println("Child")
    }
}

