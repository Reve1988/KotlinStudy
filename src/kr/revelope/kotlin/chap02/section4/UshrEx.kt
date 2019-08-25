package kr.revelope.kotlin.chap02.section4

fun main() {
    val number1 = 5
    val number2 = -5

    println("number1 : $number1")
    println("number1 shr 1 : ${number1 shr 1}") // 오른쪽으로 1비트 밀림 (부호변화 없음)
    println("number1 ushr 1 : ${number1 ushr 1}") // 오른쪽으로 1비트 밀림 (부호비트도 밀리지만 부호비트가 0이므로 변화 없음)
    println("number2 shr 1 : ${number2 shr 1}") // 오른쪽으로 1비트 밀림 (부호변화 없음)
    println("number2 ushr 1 : ${number2 ushr 1}") // 오른쪽으로 1비트 밀림 (부호비트가 밀려서 매우 큰 양수가 됨)
}