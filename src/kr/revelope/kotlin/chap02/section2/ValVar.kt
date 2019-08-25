package kr.revelope.kotlin.chap02.section2

fun main() {
    // 추론 타입을 보고 싶으면 커서를 두고 ctrl + shift + p

    val int1 = 10
    val int2: Int = 10

    val double1 = 10.0
    val double2: Double = 10.0

    val isOpen = true
    val isUploaded: Boolean = false

    val ch1 = 'a'
    val ch2: Char = 'a'
    // 코틀린에서 문자에 숫자를 넣는것은 불가능
    // val ch3: Char = 65
    // 단, 문자를 숫자와 연산은 가능
    println("ch : " + (ch1 + 1))
    // 숫자를 문자로 바꾸는것도 가능
    val ch3 = 98.toChar()
    println("ch : $ch3")

    var number = 10
    println("number : $number")
    number = 20_000
    println("number : $number")
}