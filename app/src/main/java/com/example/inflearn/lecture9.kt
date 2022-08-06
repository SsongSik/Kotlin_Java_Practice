package com.example.inflearn

fun main(){
    val numbers = listOf(1, 2, 3)

    for(number in numbers){
        println(number)
    }

    for(i in 1..3){
        println(i)
    }

    for(i in 100 downTo 1 step 2){
        println(i)
    }
}
