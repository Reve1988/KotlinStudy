package kr.revelope.kotlin.chap02.section3

fun main() {
    simpleCheck()
    smartCastByAny()
}

fun simpleCheck() {
    val num = 256

    if (num is Int) {
        println("num is Int")
    }
}

fun smartCastByAny() {
    // 어떠한 형도 담을 수 있는 Any
    val str: Any = "Hello"

    // 데이터가 들어가 있어도 Any인 상태
    println(str)

    // 형 검사를 할 때 스마트캐스트
    if (str is String) {
        println(str)
    }

    // as키워드를 이용하여 if문 없이 스마트캐스트가 가능
    println(str as String)

    // 형변환이 불가능하면 예외 발생
    // val num: Int = str as String

    // 값이 null인 경우 예외 발생
    val v: Any? = null
    // val str2: String = v as String

    // safe call과 같이 safe cast도 가능
    // 단, null일 경우 null로 전달됨
    val str2: String? = v as? String
    println("str2 : $str2")
}