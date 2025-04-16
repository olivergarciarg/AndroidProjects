package com.motawebdev.kotlinbasics

fun main() {
    var number: Int
    println("enter a number")
    try {
        number = readln().toInt()
        println("User entered: $number")
    } catch(e: Exception) {
        println("Error ${e.message}")
    } finally {
        println("This is always executed")
        number = 0
    }

}