package com.practice.kotlinbasics

fun main(){
    println( "Please enter a number: ");

    val inputString = readln();
    val inputNumber = inputString.toInt();

    val multiplier = 5;

    val result = inputNumber.times(multiplier);
    print("Result of operation is: $result");
}