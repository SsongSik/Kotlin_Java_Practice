package com.example.inflearn.lecture9

class Cat(
    species : String
) : Animal(species, 4) {
/*
extends를 사용하지 않고 : 를 사용함
어떤 클래스를 상속받을 때 상위 클래스의 생성자를 바로 호출해야함
오버라이드를 필수적으로 붙여줘야함
 */
    override fun move() {
        println("고양이가 사뿐 사뿐 걸어가~")
    }
}