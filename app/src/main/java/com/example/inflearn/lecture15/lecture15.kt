package com.example.inflearn.lecture15

import android.app.Person

/*
다양한 함수를 다루는 방법
1. 확장함수
   자바로 만들어진 라이브러리를 윶보수, 확장할 때 코틀린을 붙이고 싶을 때
   함수의 코드 자체는 밖에 있는데, 안에 있는 것처럼 쓸 수 있다.

2. infix 함수
   중위함수, 함수를 호출하는 새로운 방법
   downTo, step도 함수
   변수.함수이름() 대신 변수 함수이름 argument 이렇게 호출함
   infix를 붙이면 3 add2 4 이렇게 할 수 있음
   infix는 멤버함수 확장함수 둘 다 붙일 수 있음

3. inline 함수
   함수가 호출되는 대신 함수를 호출한 지점에 함수 본문을 그대로 복사하는 것

4. 지역함수
   함수 안에 함수를 선언할 수 있음
   depth가 깊어지기도 하고, 코드가 깔끔해지지 않다.
 */
fun main(){
    val str = "ABC"
//    멤버함수인것처럼 사용할 수 있음
    /*
    원래 String에 있는 멤버함수처럼 사용할 수 있다는게 확장함수의 특징

    멤버함수와 확장함수의 시그니처가 동일하면 멤버함수가 우선적으로 호출된다.
    확장함수가 오버라이드 된다면?
    Train타입으로 선언하면 Train의 확장함수
    Srt타입으로 선언하면 Srt
     */
    println(str.lastChar())

    3.add2(4)
    3 add2 4

}

fun String.lastChar() : Char {
    //확장함수
    /*
    String클래스를 확장하기 때문에 String.
    this를 통해 인스턴스에 접근이 가능하다.
    this를 수신객체라고하며
    클래스를 수신객체타입이라고 부름
     */
    return this[this.length-1]
}

infix fun Int.add2(other : Int) : Int{
    return this + other
}