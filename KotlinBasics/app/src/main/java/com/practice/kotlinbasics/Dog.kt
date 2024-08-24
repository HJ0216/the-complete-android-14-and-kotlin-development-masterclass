package com.practice.kotlinbasics

class Dog(name: String, val breed: String, var age: Int = 0) {
    init {
        bark(name);
    }

    fun bark(name: String){
        println("$name Woof Woof!");
    }
}