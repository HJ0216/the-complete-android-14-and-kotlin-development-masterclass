package com.practice.rockscissorspaper

fun main(){
    var computerChoice = "";
    var playerChoice = "";

    println("Enter the number, 1: Rock, 2: Scissors, 3: Paper");

    playerChoice = readln();
    val randomNumber = (1..3).random();

    if(randomNumber == 1){
        computerChoice = "Rock";
    } else if(randomNumber == 2){
        computerChoice = "Scissors";
    } else {
        computerChoice = "Paper";
    }

    // if -> when
    when(randomNumber){
        1 -> {
            computerChoice = "Rock";
        }
        2 -> {
            computerChoice = "Scissors";
        }
        3 -> {
            computerChoice = "Paper";
        }
    }

    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        else -> "Computer"
    }

    if(winner == "Tie"){
        println("Tie");
    } else {
//        println(winner + "won!");
        println("$winner won!");
    }

    while(true){
        println("Enter the value, Rock, Scissors, Paper");

        playerChoice = readln().lowercase();

        if(playerChoice == "rock" || playerChoice == "scissors" || playerChoice == "paper"){
            val winner = when {
                playerChoice == computerChoice -> "Tie"
                playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
                playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
                playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
                else -> "Computer"
            }

            if(winner == "Tie"){
                println("Tie");
            } else {
                println("$winner won!");
            }

            break;

        }
    }
}