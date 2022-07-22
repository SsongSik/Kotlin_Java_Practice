package com.example.inflearn

fun main() {

}
//함수에서 void(Unit)가 생략됨.
//if문은 자바와 차이가 없다.
fun validateScoreIsNotNegative(score : Int){
    if(score !in 0..100){
        throw IllegalArgumentException("${score}의 범위 이상")
    }
}
/*
자바에서 if-else는 Statement이지만,
코틀린에서는 Expression이다.
즉, 하나의 값으로 도출되는 문장을 사용한다.
따라서 다음과 같이 바로 return이 가능하다!!
(코틀린에서는 자바처럼 삼항연산자가 필요없다.)
 */
fun getPassOrFail(score : Int) : String {
    return if(score > 50) {
        "P"
    }else{
        "F"
    }
}

fun getGrade(score : Int) : String{
    return if(score >= 90){
        "A"
    }else if(score >= 80){
        "B"
    }else{
        "F"
    }
}
//이렇게 대체 가능
fun getGradeWithSwitch1(score : Int): String{
    return when(score){
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}
//when
//이도 하나의 익스프레션이기 때문에 한번에 return가능
//switch 대신 when
// case대신 화살표로 표시하면 됨.
//default 대신 else로 사용해야함
fun getGradeWithSwitch(score : Int): String{
    return when(score/10){
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

//when에 조건부에는 어떠한 expression이 들어갈 수 있다(ex. is Type)
//따라서 다음과 같은 코드가 가능함
fun startsWithA(obj : Any): Boolean{
    return when (obj){
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int){
    when(number){
        1,0,-1 -> println("ㅎㅎ")
        else -> println("1, 0, -1 이 아닙니다.")
    }
}

/*
자바의 switch는 kotlin에서 when으로 대체되었고,
when은 더 강력한 기능을 갖는다. 다음과 같이
 */
fun judgeNumber2(number: Int){
    when{
        number == 0 -> println("0")
        number % 2 == 0 -> println("짝")
        else -> println("홀")
    }
}


