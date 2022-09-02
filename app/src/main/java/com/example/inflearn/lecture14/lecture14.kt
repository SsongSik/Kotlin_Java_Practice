package com.example.inflearn.lecture14

/*
코틀린에서 배열과 컬렉션을 다루는 방법

1. 배열
2. 코틀린에서의 List, Set, Map
3. 컬렉션의 null 가능성
 */

fun main(){
    //배열
    val array = arrayOf(100, 200)
    //0부터 마지막 index까지 for문을 돌림
    for(i in array.indices){
        println("$i ${array[i]}")
    }
    //쉽게 추가할 수 있음
    array.plus(200)
    //인덱스와 밸류를 한 번에 도출함
    for((idx, value) in array.withIndex()){
        println("${idx}, ${value}!")
    }

    //List, Set, Map 말고도 Mutable이 붙은것이 있음
    /*
    Mutable은 컬렉션에 element를 추가, 삭제할 수 있음
    불변컬렉션은 추가, 삭제할 수 없음

    불변컬렉션이라 하더라도 Reference Type인 Element의 필드는 바꿀 수 있음
    새로운 Money를 넣을 순 없다.
    하지만 첫 번째 Money에 접근해서 그 안에 있는 필드인 price는 바꿀 수 있음

    */

    //불변리스트를 만들 수 있음
    val numbers = listOf(100, 200)
    val emptyList = emptyList<Int>() //비어있는 리스트를 만들 때는 타입을 적어주어야함

    //바로 대괄호로 가져올 수 있음
    println(numbers[0])

    for(number in numbers){
        println(number)
    }

    for((idx, value) in numbers.withIndex()){
        println("${idx}, ${value}!")
    }

    //가변리스트
    val numbers1 = mutableListOf(100, 200)
    numbers1.add(300)

    //Set 집합
    /*
    Set도 위와 같음
    가변으로는 MutableSetOf 라고 적고, 기본 구현체는 LinkedHashSet이다.
     */

    //map
    val oldMap = mutableMapOf<Int, String>()
    //가변맵이기 때문에 (key, value)를 넣을 수 있다.
    //java처럼 put을 사용할 수 있고, 밑에처럼 map[key] = value를 쓸 수도 있다.
    oldMap[1] = "MONDAY"
    oldMap[2] = "MONDAY"

    //중위호출
    mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for(key in oldMap.keys){
        println(key)
        println(oldMap[key])
    }

    for((key, value) in oldMap.entries){
        println(key)
        println(value)
    }

    /*
    컬렉션의 null가능성
    List<Int?> 리스트에 null이 들어갈 수 있지만, 리스트는 절대 null이 아님
    List<Int>? 리스트에는 null이 들어갈 수 없지만, 리스트는 null일 수 있음
    List<Int?>? 리스트에 null이 들어갈 수도 있고, 리스트가 null일 수도 있음
     */

}
