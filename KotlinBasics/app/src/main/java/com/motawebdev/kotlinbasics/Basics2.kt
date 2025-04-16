package com.motawebdev.kotlinbasics

fun main() {
//    val shoppingList = listOf("Processor", "RAM", "Graphics Card", "SSD")
    val shoppingList = mutableListOf("Processor", "RAM", "Graphics Card RTX 5090", "SSD")

    shoppingList.add("Cooling System")
    shoppingList.remove("SSD")
//    println(shoppingList)
//    shoppingList.removeAt(2)
//    println(shoppingList)
//    shoppingList.removeAt(1)
    println(shoppingList)
    shoppingList[2] = "Graphics Card RTX 5090 Super"
    println(shoppingList)
    shoppingList.set(3, "Water Cooling System")
    println(shoppingList)
    val hasRam = shoppingList.contains("RAM")
    println(hasRam)

//    for (item in shoppingList) {
//        println(item)
//        if (item == "RAM") {
//            shoppingList.removeAt(shoppingList.lastIndex)
//            break
//        }
//    }

//    for (item in 0 until shoppingList.size) {
//        println(shoppingList[item])
//        if (shoppingList[item] == "RAM") {
//            shoppingList.removeAt(shoppingList.lastIndex)
//            break
//        }
//    }
//    println(shoppingList)
}