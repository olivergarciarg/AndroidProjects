package com.motawebdev.kotlinbasics

class Dog (val name: String, val breed: String, var age: Int = 0) {
    init {
//        println("Dog was created")
        bark(name)
    }
    fun bark(name: String) {
        println("$name says Woof Woof")
    }
}