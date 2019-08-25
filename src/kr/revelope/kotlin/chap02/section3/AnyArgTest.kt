package kr.revelope.kotlin.chap02.section3

fun main() {
    checkArg("Hello")
    checkArg(10)
}

/**
 * 인자를 Any형으로 받으면 어떤 자료형이던 사용이 가능
 */
fun checkArg(x: Any) {
    if (x is String) {
        println("Value is String : $x")
    } else if (x is Int) {
        println("Value is Int : $x")
    }
}