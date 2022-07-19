package com.example.inflearn

import android.app.Person

fun main(){
    // 1. 변수
    var number1 = 10L //바뀔 수 있는 변수
    //자동으로 타입을 의무적으로 적어주지 않아도 됨
    val number2 = 10L //바꿀 수 없는 변수, 자바에서의 final과 같음

    var number3 : Long //초기화 하지 않은 변수를 사용하기 위해선 변수의 타입을 적어주어야함
    //println(number3) 값이 없기 때문에 에러가 발생함

    //val 컬렉션에서도 그 자체를 바꾸진 못하더라도 값을 추가할 수는 있음

    var number4 = 10L
    var number5 = 1_1000L

    var number6: Long? = 10L //이는 아예 다른 타입
    //number6 = null 기본적으로 null값을 허용하지 않음
    number6 = null //이는 허용 타입 + ? 를 적어주어야함

    //var person = Person("윤성식")
    //객체를 인스턴스화 할 때 new를 붙이지 않아야 한다
    println(number1)
}