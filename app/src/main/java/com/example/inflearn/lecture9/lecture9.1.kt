package com.example.inflearn.lecture9

fun main(){
    Dervied(300)

}

open class Base(
    open val number : Int = 100
){
    init{
        println("Base Class")
        println(number)
        //이렇게 상위클래스에서는 하위클래스의 field에
        //접근하면 안 된다고 이야기 하고 있음
        /*
        따라서 상위클래스를 설계할 때
        생성자 또는 초기화 블록에 사용되는 프로퍼티에는 open을 피해야한다.
         */
    }
}

class Dervied(
    override val number : Int
) : Base(number){
    init{
        println("Dervied Class")
    }
}

/*
final : override를 할 수 없게 한다. default로 보이지 않게 존재한다.
open : override를 열어준다.
abstract : 반드시 override 해야한다
override : 상위 타입을 오버라이드 하고 있다.
코틀린에서는 어노테이션이 아니라 키워드로 사용해야한다.
 */