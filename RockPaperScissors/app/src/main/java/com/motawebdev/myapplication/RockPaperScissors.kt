package com.motawebdev.myapplication

fun main() {
//    val options = arrayOf("Rock", "Paper", "Scissors")
//    val gameChoice = getGameChoice(options)
//    val userChoice = getUserChoice(options)
//    printResult(userChoice, gameChoice)
    var computerChoice = ""
    var playerChoice = ""
    println("Rock, Paper, Scissors? enter choice")
    playerChoice = readLine().toString()
    while (playerChoice != "Rock" && playerChoice != "Paper" && playerChoice != "Scissors") {
        println("Invalid choice. Please enter Rock, Paper, or Scissors.")
        playerChoice = readLine().toString()
    }
    val randomNumber = (1..3).random()
    when (randomNumber) {
        1 -> computerChoice = "Rock"
        2 -> computerChoice = "Paper"
        3 -> computerChoice = "Scissors"
    }
//    if (randomNumber == 1) {
//        computerChoice = "Rock"
//    } else if (randomNumber == 2) {
//        computerChoice = "Paper"
//    } else {
//        computerChoice = "Scissors"
//    }
    println(computerChoice)

    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }
    println(winner)
}