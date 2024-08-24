package com.practice.kotlinbasics

fun main(){
    val numbers = mutableListOf<Int>(1,2,3,4,5)

    for (item in 0 until numbers.size) {
        println(item)
    }

    for (item in 0 .. numbers.size - 1){
        numbers[item] = numbers[item]*2
        println(numbers[item])
    }
}