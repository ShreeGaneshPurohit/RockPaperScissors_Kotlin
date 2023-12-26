package com.example.rockpaperscissors

fun main() {
    var computerChoice = ""
    var userChoice = ""
    var choices = arrayOf(
        "rock",
        "paper",
        "scissors"
    )
    while (userChoice !in choices){
        println("Wrong Input Try Again!")
        println("Rock, Paper, or Scissors ?\nEnter Your Choice! ")
        userChoice = readln()
        userChoice.lowercase()
    }


    when ((1..3).random()) {
        1 -> computerChoice = "Rock".lowercase()
        2 -> computerChoice = "Paper".lowercase()
        3 -> computerChoice = "Scissors".lowercase()
    }
    userChoice = userChoice.lowercase();

    var winner = when {
        userChoice == computerChoice -> "Tie"
        userChoice == "paper" && computerChoice == "rock" ->"Player"
        userChoice == "rock" && computerChoice =="scissors" ->"Player"
        userChoice == "scissors" && computerChoice =="paper" ->"Player"

        else ->"Computer"
}
    print("$winner won! since computer selected $computerChoice ")
}