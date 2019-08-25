package kr.revelope.kotlin.chap02.section3

fun main() {
    // 모든 자료형은 Any라는 최상위 클래스를 상속받는다.
    // 따라서 어떤 자료형이던 스마트캐스트가 가능하다.

    var a: Any = 20
    println("a : $a (${a.javaClass})")

    a = 20L
    println("a : $a (${a.javaClass})")

    a = 20.0
    println("a : $a (${a.javaClass})")

    a = 20.0f
    println("a : $a (${a.javaClass})")

    a = true
    println("a : $a (${a.javaClass})")

    a = "HelloWorld!!"
    println("a : $a (${a.javaClass})")
}