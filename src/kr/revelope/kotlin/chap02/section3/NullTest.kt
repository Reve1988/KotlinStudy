package kr.revelope.kotlin.chap02.section3

/**
 * 코틀린은 기본적으로 Null을 허용하지 않음
 * Null을 사용하기 위해서는 별도의 작업이 필요
 */
fun main() {
    test1()
    test2()
}

/**
 * 일반적인 Null 초기화 시도 - 불가능
 */
fun test1() {
    // val str: String = null
    // println("string : $str")
}

/**
 * Null 초기화를 위해서는 ?가 필요
 */
fun test2() {
    val str: String? = null

    println("string : $str")

    // 다만 일반적인 방법으로 사용하면 컴파일러에서 거절됨
    // println("size : ${str.length}")

    // null check를 할 경우에는 사용할 수 있음
    if (str != null) {
        println("size : ${str.length}")
    }

    // safe call 기호(?)를 사용하면 간단하게 null check가 가능
    // 이는 (str != null) ? str.length : null 과 같음
    println("size : ${str?.length}")

    // 엘비스(Elvis) 연산자(:)와 함께 사용
    // 이는 (str != null) ? str.length : -1 과 같음
    println("size : ${str?.length ?: -1}")

    // non-null 단정기호(!!)를 사용하면 컴파일러가 null 가능성 검사를 하지 않음
    println("size : ${str!!.length}")
}