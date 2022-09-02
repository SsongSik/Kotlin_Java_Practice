package com.example.inflearn.lecture13

import java.util.function.ToDoubleBiFunction

/*
data 키워드를 붙여주면
자동으로 equals, hashCode, toString을 만들어줌
 */

fun main() {
    val dto1 = PersonDto("윤성식", 25)
    val dto2 = PersonDto("윤성식", 25)
    println(dto1) //toString
}


data class PersonDto(
    val name : String,
    val age : Int
)

/*
enum Class
추상적인 클래스를 상속받을 수 없지만 인터페이스는 구현 가능.

 */
fun handleCountry(country : Country){
    when (country){
        Country.AMERICA -> TODO()
        Country.KOREA -> TODO()
        Country.A -> TODO()
    }
}

enum class Country(
    private val code : String,
){
    KOREA("KO"),
    AMERICA("US"),
    A("A")
    ;
}