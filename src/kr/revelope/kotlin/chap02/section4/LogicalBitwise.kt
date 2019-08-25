package kr.revelope.kotlin.chap02.section4

fun main() {
    val number1 = 12
    val number2 = 25
    var result: Int

    // 비트를 1:1 대응하며, or연산을 진행
    result = number1 or number2
    // result = number1.or(number2)
    println(result)

    result = number1 and number2
    // result = number1.and(number2)
    println(result)
}