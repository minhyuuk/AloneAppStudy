package com.example.myapplication.Kotlin

// 04. Function
// - 함수
//   어떤 input을 넣으면 어떤 output이 나오는 것
//   ex) y = x + 2

// - 함수를 선언하는 방법
// fun 함수명(변수명:타입,변수명:타입) : 반환형{
//      함수 내용
//      return 반환값
//}

fun plus(first: Int, second: Int): Int {

    println(first)
    println(second)

    val result: Int = first + second
    return result

}

// - 디폴트 값을 갖는 함수 만들기
fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}

// - 반환값이 없는 함수 만들기
fun hello(first: Int, second: Int = 5): Unit {

    val result2: Int = first + second

}

//fun main(args: Array<String>) {
//
//    // 함수를 호출 하는 방법
//    val result = plus(10, 20)
//    println(result)
//
//    // 인수를 명시적으로 전달하는 방법
//    val result2 = plus(first = 20, second = 30)
//    println(result2)
//
//    // 디폴트 값을 갖는 함수 호출하기
//    println()
//    val result4 = plusFive(10, 20)
//    println(result4)
//    val result5 = plusFive(10)
//    println(result5)
//
//
//}
