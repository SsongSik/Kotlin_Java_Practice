package com.example.inflearn

//코틀린에서 연산자를 다루는 방법
fun main(){
    /*
    단항연산자 ++, --
    산술연산자 + - * / %
    산술대입연산자 += -= 등등 모두 자바와 동일

    비교연산자 > < <= >= 자바와 동일
    객체를 비교할 때 비교 연산자를 사용하면 자동으로 compareTo를 호출해준다.
    아래처럼.
     */
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if(money1 > money2){
        println("1 > 2")
    }

    /*
    주소하고 값이 모두 같은걸 동일, 값만 같은 경우에는 동등
    비교 연산자와 동등성, 동일성
    자바에서는 동일성에 == 을 사용하고, 동등성에 equals를 직접 호출함
    코틀린에서는 동일성에 ===을 사용하고, 동등성에 ==를 호출함
    ==를 사용하면 간접적으로 equals를 호출해준다.
     */

    val money3 = JavaMoney(1_000L)
    val money4 = money3
    val money5 = JavaMoney(1_000L)

    println(money3 === money5) // false가 출력됨
    //값은 같지만 주소는 다르기 때문에
    println(money3 === money4) // 반면 이는 true가 출력됨


    /*
    && || ! 논리연산자
    Java와 완전히 동일함. java처럼 Lazy연산을 수행한다.
     */
    if(fun1() || fun2()){
        println("본문")
    }
    /*
    이렇게 되면 fun 1 과 본문이 출력이됨.
    왜냐하면 fun1 을 보고 true인 부분을 알았으면 fun2와 관계없이 어차피 true일테니
    fun2는 실행되지 않음
     */
    if(fun2() && fun1()){
        println("본문")
    }
    //이도 마찬가지로 fun2가 false이기 때문에 fun1과 관계없이 false이므로 뒤에 함수는 실행되지 않음

    /*
    in / !in
    컬렉션이나 범위에 포함되어 있다, 포함되어 있지 않다

    a..b
    a부터 b까지의 범위 객체를 생성한다.

    a[i] a에서 특정 index i로 가져온다.
    a[i] = b 이도 가능

    객체끼리의 연산을 할 때 plus같은 메소드를 통해 하는 것이 이나리
    객체끼리 직접 연산을 할 수 있다.
     */
}
fun fun1() : Boolean{
    println("fun 1")
    return true
}
fun fun2() : Boolean{
    println("fun 2")
    return false
}