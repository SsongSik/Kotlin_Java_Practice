package com.example.inflearn

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.NumberFormatException

/*
1. try catch
2. checked Exception, Unchecked
3. try with resources
 */
fun main()
{
    var number : Long? = 3L
}

fun parseInt(str : String) : Int{
    try{
        return str.toInt()
    }catch(e : NumberFormatException){
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다")
    } //catch 문에서 타입이 뒤에 위치하고, new를 사용하지 않음
}

//try catch 도 하나의 expression으로 인식함
//따라서 다음과 같이 적어줄 수 있음
//다른 것은 문법적으로 동일하지만 expression인 것만 기억하면 됨
fun parseInt1(str : String) : Int?{
    return try{
        str.toInt()
    }catch (e : NumberFormatException){
        null
    }
}

/*
자바에서는 IOException을 처리했어야하는데 코틀린에서는 괜찮음
throws구문이 없음.
코틀린에서는 checked Exception과 unchecked Exception을 구분하지 않음.
모두 unchecked Exception임 그래서 다음과 같이 throw IOException을 해주지 않아도 됨
 */
fun readFile(){
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}

//try with resources
//코틀린에서는 이게 없음
//이게 사라지고 use라는 확장함수를 사용함
fun readFile1(path : String){
    BufferedReader(FileReader(path)).use { reader ->
        println(reader.readLine())
    }
}
