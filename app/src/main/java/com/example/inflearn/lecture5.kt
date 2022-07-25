package com.example.inflearn

fun main(){
    /*
    for - each
    for
    progression and range
    while
     */

    //for each
    val numbers = listOf(1L, 2L, 3L)
    // : 콜론 대신 in을 사용함
    for(number in numbers){
        println(number)
    }

    //for
    /*
    ..은 범위를 만들어내는 연산자
    range는 Progression을 상속받고 있음
    시작값, 끝값, 공차 3개의 변수가 필요함
    사실은 이 코드는 등차수열을 만들고 있는 코드임
     */
    for(i in 1..3){
        println(i)
    }
    //downTo, step도 함수
    for(i in 5 downTo 1){
        println(i)
    }

    //1부터 5까지의 공차1인 등차수열을 생성
    //공차를 2로 바꿈
    for( i in 1..5 step 2){
        println(i)
    }

    //자바와 완전 동일
    var i = 1
    while(i<=3){
        println(i)
        i++
    }
}
