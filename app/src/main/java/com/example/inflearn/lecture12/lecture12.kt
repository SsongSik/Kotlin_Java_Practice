package com.example.inflearn.lecture12

/*
코틀린에서 중첩 클래스를 다루는 방법

1. 중첩 클래스의 종류
2. 코틀린의 중첩 클래스와 내부 클래스

static을 사용하는 중첩 클래스(권장되는 클래스)

static을 사용하지 않는 중첩 클래스

만일 static을 붙인 클래스라면 바깥 클래스를 바로 불러올 수 없었지만
붙이지 않은 클래스라면 바깥 클래스를 바로 불러올 수 있었다.

하지만 외부 클래스를 참조할 때 문제점이 생긴다.
따라서 클래스 안에 클래스를 사용할 때에는 static을 사용한다.
 */

class JavaHouse(
    private val address : String,
    private val livingRoom : LivingRoom
){
    class LivingRoom(
        private val area : Double
        //그냥 클래스 만들듯이 편하게 작성하면됨.
        //바깥 클래스에 대한 연결이 없는 중첩 클래스가 만들어지기 때문이다.
    )
    //기본적으로 바깥클래스를 참조하지 않게 되어있음
}

class House(
    private val address : String,
    private val livingRoom : LivingRoom
){
    //권장되지 않은 클래스 안의 클래스
    //inner라는 키워드를 직접적으로 붙여줘야함
    //바깥 클래스를 참조할때는 this@바깥클래스 이렇게 사용해주어야함
    inner class LivingRoom(
        private val area : Double
    ){
        val address : String
            get() = this@House.address
    }
}
