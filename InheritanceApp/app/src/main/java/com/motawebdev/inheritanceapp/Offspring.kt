package com.motawebdev.inheritanceapp

class Offspring: Secondary(), Archery, Singer {
//    override fun role() {
//        super.role()
//        println("Offspring of the house of Secondary")
//    }

    override fun archery() {
        super.archery()
        println("Archery skills enhanced by Offspring")
    }

    override fun sing() {
        super.sing()
        println("Singing skills enhanced by Offspring")
    }
}