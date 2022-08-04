package com.example.inflearn

/*
1. 클래스와 프로퍼티
2. 생성자와 init
3. 커스텀 getter, setter
4. backing field
 */
fun main(){
    val person = Person("ssongsik", 25)
    println(person.name) //getter를 안쓰고 이렇게 편리하게 불러올 수 있음
    //person.setAge(10) 이런식으로 했어야했는데
    person.age = 10 //이렇게 가능
    println(person.age)
    //자바클래스를 가져오더라도 .필드로 바로 사용 가능.

    val person1 = Person1("ssongsik2")
}
/*
getter, setter자동으로 만들어짐
constructor는 생략가능.
 */
class Person constructor(name : String, age : Int){
    val name = name
    var age = age
}

//이렇게 바꿔줄 수 있음
//프로퍼티 선언과 생성자를 동시에 합칠 수 있음
class Person1 (
    val name : String, var age : Int
){
    init{ //클래스가 초기화되는 시점에서 한 번 실행되는 지점, 생성자가 실행되는 시점
        if(age <= 0){
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화") //이는 역순으로 실행됨. = 초기화 블록부터 차례로 호출된다.
    }
    constructor(name : String): this(name, 1){
        println("첫 번째 부 생성자")
    }
    //생성자를 추가하고 싶은 경우에는 위의 생성자를 그대로 두고
    //아래 생성자를 새로 적어줌.
    /*
    위에 있는 생성자를 주 생성자로 부르고, 반드시 존재햐아한다.
    아래 있는 생성자는 부 생성자로 부르고, 없을 수도 있다.
    또한, 최종적으로 주 생성자를 this로 호출해야한다.
    body를 가질 수 있다.
     */
}