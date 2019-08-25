package kr.revelope.kotlin.chap03.section1

// 함수의 기본 형태
fun sum(a: Int, b: Int): Int {
    return a + b
}

// 중괄호({})를 등호(=)로 대체 가능
fun dif(a: Int, b: Int): Int = a - b

// 반환형이 유추 가능하다면 반환형 생략 가능
fun mul(a: Int, b: Int) = a * b

fun main() {
    println(sum(5, 3))
    println(dif(5, 3))
    println(mul(5, 3))
}