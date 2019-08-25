package kr.revelope.kotlin.chap03.section1

fun main() {
    add("홍길동")
    add("둘리", "dooly@example.kr")

    defaultArgs()
    defaultArgs(200)
    defaultArgs(200, 400)
}

// 매개변수에 기본값을 줄 수 있다.
fun add(name: String, email: String = "default") {
    val output = "${name}님의 email은 ${email}입니다."
    println(output)
}

fun defaultArgs(x: Int = 100, y: Int = 200) {
    println(x + y)
}