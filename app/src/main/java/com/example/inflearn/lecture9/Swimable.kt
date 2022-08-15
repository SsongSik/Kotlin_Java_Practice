package com.example.inflearn.lecture9

interface Swimable {

    //아래에서 정의해줄 것을 기대함.
    //backing field없는 프로퍼티를 인퍼테이스에 만들 수 있음
    //미리 정의도 가능
    //정의를 안하면 아래에서 오버라이드해서 사용해주어야함!!
    val swimAbility : Int
     get() = 3

    fun act(){
        println("어푸 어푸")
    }
}