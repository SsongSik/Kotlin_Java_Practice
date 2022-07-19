package com.example.inflearn

import android.app.Person

fun main(){
    // 1. 변수
    var number1 = 10L //바뀔 수 있는 변수
    //자동으로 타입을 의무적으로 적어주지 않아도 됨
    val number2 = 10L //바꿀 수 없는 변수, 자바에서의 final과 같음

    var number3 : Long //초기화 하지 않은 변수를 사용하기 위해선 변수의 타입을 적어주어야함
    //println(number3) 값이 없기 때문에 에러가 발생함

    //val 컬렉션에서도 그 자체를 바꾸진 못하더라도 값을 추가할 수는 있음

    var number4 = 10L
    var number5 = 1_1000L

    var number6: Long? = 10L //이는 아예 다른 타입
    //number6 = null 기본적으로 null값을 허용하지 않음
    number6 = null //이는 허용 타입 + ? 를 적어주어야함

    //var person = Person("윤성식")
    //객체를 인스턴스화 할 때 new를 붙이지 않아야 한다
    println(number1)

    //------------------
    //코틀린에서의 null check

    // safe call and Elvis
    val str: String? = "ABC"
    //println(str.length) 에러발생
    println(str?.length) //str이 null값이면 null이 출력됨
    println(str?.length ?: 0) //str이 null이라면 뒤에 0을 반환함
}

fun startWithA1(str: String?): Boolean { //null이 들어와야하기 때문에 ?를 붙여줌
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null")


//    if(str == null){
//        throw IllegalArgumentException("null")
//    }
    /*
    이 if문이 만일 없으면 바로 str.startWith() 함수가 실행을 못하게 되어있음.
    그 이유는 현재 String? 으로 인해서 null값이 들어올 수 있다는 것을 명시적으로 알려주었기 때문에
    null이 될 수도 있다는 가정하에 코틀린에서 막아두었다.
    따라서 만일 str: String 이렇게 적어주었다면, 따로 null체크를 안하더라도 실행 가능
     */
//    return str.startsWith("A")
}

fun startWithA2(str: String?): Boolean? { //return 값에 null이 들어갈 수 있기 때문에 ?를 뒤에도 적어줌
    /*
    여기서 단순히 ?로 반환이 가능한 이유는 반환 타입이 Boolean? 이기 때문이다.
    애초에 null값을 허용하기 때문에 바로 return이 가능하다.
     */
    return str?.startsWith("A")

//    if(str == null){
//        return null
//    }
//    return str.startsWith("A")
}

fun startWithA3(str: String?) : Boolean{
    /*
    null이 아닐 경우에는 startsWith가 실행이 되지만, null일 경우에는
    safe call에 의하여 false가 반환된다.
     */
    return str?.startsWith("A")
        ?: false

//    if(str == null){
//        return false
//    }
//    return str.startsWith("A")
}
// -> 코틀린에서는 null이 가능한 타입을 완전히 다르게 취급한다.

fun startsWith(str: String?): Boolean{
    //들어오는 값이 null이더라도 반환하는 값이 null이 절대 아닐 경우가 될 경우에는 !!를 붙여주면 됨
    //하지만 이 때 실제로 null값이 들어올 경우에는 NPE에러가 발생함
    //정말 null이 아닐 경우에만 사용해주어야함!!!
    return str!!.startsWith("A")
}