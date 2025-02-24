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
//    var age = 0
//    age = readln().toInt()
//    if (age >= 21) {
//        println("Now you may drink in the US")
//    } else if (age >= 18) {
//        println("You may vote now")
//    } else if (age >= 16) {
//        println("You may drive now")
//    } else {
//        println("Child")
//    }
//    var count = 0
//    while (count < 3) {
//        println("Count is $count")
//        count++
//    }
//    var userInput = readln()
//    while (userInput == "1") {
//        println("You said: $userInput")
//        userInput = readln()
//    }
//    println("Loop is done")
//    println("Who is this coffee for?")
//    var name = readln()
//    println("How many sugars do you want?")
//    val sugarCount = readln().toInt()
//    makeCoffee(sugarCount, name)
//    makeCoffee(1, "Amy")
//    makeCoffee(2, "John")
//    makeCoffee(0, "Denis")
//    askCoffeeDetails()
//    println("Enter number 1")
//    val num1 = readln().toInt()
//    println("Enter number 2")
//    val num2 = readln().toInt()
////    var myResult = add(num1, num2)
//    var myResult = divide(num1, num2)
//    println("The result is $myResult")
    var daisy = Dog("Daisy", "Golden Retriever", 1)
    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old")
    println("A year has passed")
    daisy.age = 2
    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old")
}

fun divide(num1: Int, num2: Int): Double {
    return num1 / num2.toDouble()
}

fun add(num: Int, num2: Int): Int {
    return num + num2
}

fun askCoffeeDetails() {
    println("Who is this coffee for?")
    var name = readln()
    println("How many sugars do you want?")
    val sugarCount = readln().toInt()
    makeCoffee(sugarCount, name)
}

fun makeCoffee(sugarCount: Int, name: String) {
    if (sugarCount == 0) {
        println("Coffee with no sugar for $name")
    } else if (sugarCount == 1) {
        println("Coffee with $sugarCount spoon of sugar for $name")
    } else {
        println("Coffee with $sugarCount spoons of sugar for $name")
    }
//    println("Buy beans")
//    println("Grind beans")
//    println("Boil water")
//    println("Mix water and coffee grinds")
//    println("Pour coffee in cup")
//    println("Add sugar and milk")
//    println("Stir")
//    println("Drink")
}
