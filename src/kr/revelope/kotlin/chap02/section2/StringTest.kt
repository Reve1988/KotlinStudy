package kr.revelope.kotlin.chap02.section2

fun main() {
    // 참고 : == (java의 euqals함수와 같음) / === (java의 ==과 같음)
    val str1: String = "Hello"
    val str2 = "World"
    val str3 = "Hello"

    // java의 String과 같은 특징을 가지고 있다는걸 의미
    println("str1 === str2 : ${str1 === str2}")
    println("str1 === str3 : ${str1 === str3}")
}