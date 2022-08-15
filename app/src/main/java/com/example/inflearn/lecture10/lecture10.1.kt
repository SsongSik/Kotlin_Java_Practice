package com.example.inflearn.lecture10

import android.service.autofill.ImageTransformation

/*
1. 자바와 코틀린의 가시성 제어
2. 코틀린 파일의 접근 제어
3. 다양한 구성요소의 접근제어
4. 자바와 코틀린을 함께 사용할 경우 주의할 점
자바의 접근 제어
public           -> 모든 곳에서 접근 가능
protected        -> 선언된 클래스 또는 하위클래스에서만 접근 가능
default          -> internal (같은 모듈에서만 접근 가능)
private          -> 선언된 클래스 내에서만 접근 가능
코틀린의 기본 접근 지시어는 public
 */

//protected val a = 3 파일 최상단에는 바로 사용할 수 없음

class Cat protected constructor(
    //constructor 를 생략할 수 있었지만 접근지시어를 붙이려면 constructor무조건 사용해주어야함
)

class Car(
    val name : String, //getter, setter 모두 internal
    var owner : String, //getter ,setter 모두 private
    _price : Int
){
    var price = _price  //getter는 public, setter는 private
    //Car는 사실 3개의 getter와 owner와 price 두 개의 setter가 있는 것임
}

fun main(){

    val car = Car("sonata", "yss", 1000)
//    car.name = "ss"
    car.owner = "ss"
    car.price = 2000
}
