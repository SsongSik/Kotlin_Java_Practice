package com.example.inflearn

/*
1. 함수 선언 문법
2. default parameter
3. named argument
4. 같은 타입의 여러 파라미터 받기(가변인자)
 */
fun main(){
    //3. 만일 여기서 true는 false로 바뀌어서 바꾸어주고 있는데, 3은 그대로 쓰고싶다면
    //이 때 named 를 해주면됨
    repeat1("hi", useNewLine = false)

    //이렇게 잘못 호출할 수 있음
    //동일한 타입이기 때문에 컴파일에서 확인할 수 없음
    //따라서 코틀린에서는 named argument로 인해 이 문제를 해결할 수 있음
    //builder의 장점을 활용할 수 있음
    printNameAndGender("FEmail", "윤성식")

    printAll("A", "b", "c")

    val array = arrayOf("A", "B", "C")
    printAll(*array)
}
/*
함수의 전체 중괄호를 빼고 하나의 값이기 때문에 '='으로 다음과 같이 표현 가능
public은 생략 가능
매개변수 : 타입으로 적어줌
반환타입이 모두 int이고 '=' 을 사용하기 때문에 Int생략가능
block{ } 을 사용하는 경우에는 반환 타입이 Unit이 아니면 명시적으로 꼭 작성해야함
 */
fun max(a: Int, b:Int) = if(a>b) a else b

/*
자바에서 함수를 사용할 때 함수안에 사용되는 파라미터들을 자주사용하는 파라미터들이 있어
오버로딩을 할 때가 많았다. 하지만 오버로딩할 때 마다 계속해서 똑같은 메소드를 만들어주어야만했다
하지만 코틀린에서는 default parameter가 존재함 이 문제를 해결함
물론 동일하게 오버로딩 기능은 존재함
 */
fun repeat(str : String, num : Int, useNewLine: Boolean){
    for(i in 1..num){
        if(useNewLine){
            println(str)
        }else{
            print(str)
        }
    }
}
//위를 아래처럼 바꿔줄 수 있음, 3과 true가 자주 사용되는 함수
//밖에서 파라미터를 넣어주지 않으면 기본값을 사용
fun repeat1(
    str : String,
    num : Int = 3,
    useNewLine : Boolean = true
){
    for(i in 1..num){
        if(useNewLine){
            println(str)
        }else{
            print(str)
        }
    }
}

fun printNameAndGender(name : String, gender : String){
    println(name)
    println(gender)
}

/*
자바에서는 ...을 썼지만 코틀린에서는 vararg를 적어주어야하고
배열을 바로 넣는 대신 스프레드 연산자(*)를 붙여주어야함
 */
fun printAll(vararg strings : String){
    for(str in strings){
        println(str)
    }
}