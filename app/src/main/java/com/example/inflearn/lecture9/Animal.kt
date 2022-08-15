package com.example.inflearn.lecture9
/*
1. 추상클래스
2. 인터페이스
3. 클래스를 상속할 때 주의할 점
4. 상속 관련 지시어
 */
abstract class Animal(
    protected val species : String,
    protected open val legCount : Int
    //프로퍼티를 오버라이드 할 때 추상 프로퍼티가 아니라면
    //무조건 open을 붙여줘야만함
) {
    abstract fun move()
}