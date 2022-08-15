package com.example.inflearn

import kotlin.IllegalArgumentException
import kotlin.NumberFormatException

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

class Person3(
    name : String,
    age : Int = 1
){
    val name = name


    val upperName : String
     get() = this.name.uppercase()


    val age = age

    init{
        if(age <= 0){
            throw IllegalAccessException("error")
        }
    }

    val isAudult3 : Boolean
     get() = this.age >= 20


}





