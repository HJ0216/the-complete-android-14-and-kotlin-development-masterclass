package com.practice.kotlinbasics

fun main(){
    var fruitsList = mutableListOf<String>("a", "b", "p", "s", "m")
    println(fruitsList)

    fruitsList.add("m")
    println(fruitsList)

    fruitsList.remove("k")
    println(fruitsList)

    println("Is there m fruit? ${fruitsList.contains("s")}")
}