package com.example.inflearn

import java.lang.NumberFormatException

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

fun parse(str : String) : Int{
    try{
        return str.toInt()
    }catch (e : NumberFormatException){
        throw IllegalArgumentException("error")
    }
}

fun parse1(str : String) : Int?{
    return try{
        str.toInt()
    }catch (e : NumberFormatException){
        null
    }
}

fun max1(a : Int, b : Int) : Int{
    if(a>b) {
        return a
    }
    else{
        return b
    }
}

fun max2(a : Int, b : Int) = if(a>b) a else b