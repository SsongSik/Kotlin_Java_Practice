package com.example.inflearn.lecture9

class Penguin(
    species : String
) : Animal(species, 2), Swimable, Flyable {
    //인터페이스 구현도 똑같이 : 을 사용
    private val wingCount : Int = 2

    override fun move() {
        println("펭귄이 움직인다~ 꿱꿱")
    }

    //custom getter
    override val legCount : Int
    get() = super.legCount + this.wingCount

    //커스텀 게터를 통해
    override val swimAbility: Int
        get() = TODO("Not yet implemented")

    /*
    중복되는 인터페이스를 특정할 때 super<타입>.함수 를 사용
     */
    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

}