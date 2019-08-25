package kr.revelope.kotlin.chap03.section1

fun main() {
    printSum(5, 3)
    printDif(5, 3)
}

// Unit은 반환값이 없을 때 사용
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

// Unit은 생략 가능
fun printDif(a: Int, b: Int) {
    println("dif of $a and $b is ${a - b}")
}