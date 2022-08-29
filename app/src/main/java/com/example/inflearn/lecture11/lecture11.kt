package com.example.inflearn.lecture11

import java.time.format.SignStyle


/*
코틀린에서 object 키워드를 다루는 방법

1. static 함수와 변수
2. 싱글톤
3. 익명클래스
 */
fun main(){

    val person = Person.newBaby("ee")
    person.name
    person.age

    Singleton.a //이런식으로 접근
    Singleton.a += 10
}

class Person private constructor(
    var name : String,
    var age : Int,
){
    //static이 존재하지 않는다.
    //이는 Factory처럼 이름을 지어줄 수도 있고, 인터페이스를 구현해 줄 수도 있음
    companion object Factory { //클래스와 동행하는 유일한 오브젝트라는 의미
        //자바에서와의 static 변수와 함수처럼 활용된다.
        /*
        정적으로 인스턴스끼리의 값을 공유
        클래스가 인스턴스화 될 때 새로운 값이 복제되는 것이 아니라,
         */
        private const val MIN_AGE = 1
        //const 를 붙이면 컴파일 시에 변수가 할당된다.
        //런타임때 할당되는 것이 아니라,
        //진짜 상수에 붙이기 위한 용도.
        //기본 타입과 String에만 붙일 수 있음
        fun newBaby(name : String) : Person{
            return Person(name, MIN_AGE)
        }
    }
}
//싱글톤 : 단 하나의 인스턴스만을 갖는 클래스
/*
애당초 단 하나의 인스턴스이기 때문에 인스턴스화를 하는게 아니라,
코드에서 바로 .a .함수 이런식으로 접근함
 */
object Singleton{
    var a : Int = 0
}
/*
익명 클래스
특정 인터페이스나 클래스를 상속받은 구현체를 일회성으로 사용할 때 쓰는 클래스

new Movable로 하는것이 아니라 object : Movable 이렇게 구현함
object : 타입
 */




