package com.example.inflearn

import android.app.Person
//코틀린에서 Type을 다루는 방법
fun main(){
    val number1 = 4
//    val number2 : Long = number1    //Type mismatch
    //자바에서는 명시적으로 더 큰 타입으로 변경이 되었지만 코틀린에서는 안됨.
    //따라서 toLong() 을 붙여줘야함
    val number2 : Long = number1.toLong() //자바에서는 암시적으로 가능했지만
    //코틀린에서는 명시적으로 적어주어야함

    println(number1 + number2)

    val number3 : Int? = 3
    //만일 number3이 null이 될 수 있는 ?형태라면
//    val number4 : Long = number3.toLong()
    //이렇게 에러가 발생함. 따라서 safecall과 Elvis를 활용하여 null일 때 방지를 해주어야함
    val number4 : Long = number3?.toLong() ?: 0L //이런식으로

    //string interpolation
//    val person = Person("윤성식", 100)
//    val log = "제 이름은 ${person.name}"
//
//    val str = """
//        ABC
//        EFG
//        ${person.name}
//    """.trimIndent()
    //이렇게 하면 엔터가 자동적으로 출력됨

    val str1 = "ABCDE"
    println(str1[1])
    //

}

fun pritnAgeIfPerson(obj: Any){
    /*
    is는 자바에서의 instanceof obj가 person이면 true를 반환
    as Person은 (Person)이와 같음, 하지만 이는 생략가능
    만일 is not을 의미로 사용하려면 !is 사용해주면 됨
     */
    if(obj is Person){
        val person = obj as Person  //obj가 Person이면 Person으로 타입캐스팅이 됨
//        println(person.age)
    }
}

fun pritnAgeIfPerson1(obj: Any?){
    /*
    위와 같은 코드인데, 만일 obj가 null이 될 수 있는 코드라면
    당연히 null이 들어오면 NPE에러가 발생할 것이다.
    따라서 as?를 붙여줌으로써 person이 null이 될 수 있다는 것을 표현해주고
    person이 null이니까 person?.age로 이 값이 null이 될 수 있다는 것도 표현해준다.
     */
    if(obj is Person){
        val person = obj as? Person //null이 됨
//        println(person?.age)
    }
}
/*
any는 자바에서의 object와 같음
any자체로는 null을 포함할 수 없어 any?로 표현해야함

unit은 자바에서의 void와 동일한 역할

Noting은 함수가 정상적으로 끝나지 않았다는 사실을 표현하는 역할
ex) 예외를 반환하는 함수/무한루프 함수
 */