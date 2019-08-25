package kr.revelope.kotlin.chap02.section3

fun main() {
    cast()
    compare()
}

fun cast() {
    // 명시적 형변환 (자동형변환은 안됨)
    val a: Int = 1
    val b: Double = a.toDouble()

    // 다른 자료형끼리 연산 (자료형이 표현할 수 있는 범위가 가장 큰 자료형으로 자동형변환)
    val result = 1L + 3.1
}

fun compare() {
    // Int의 경우에는 컴파일 후 primitive타입으로 변환되므로 참조비교의 의미가 없음
    val a: Int = 128
    val b: Int = 128

    // 값만 비교 (==)
    println("a == b ? ${a == b}")
    // 참조주소만 비교 (===)
    println("a === b ? ${a === b}")

    // 단, null을 허용하는 Int는 primitive타입 변환이 되지 않으므로 참조비교가 가능
    // 참고 : 정수의 값이 -128 ~ 127 범위에 있으면 그 값은 캐시에 저장되기 때문에 참조값이 같을 수 있다.
    val c: Int? = 128
    val d: Int? = 128

    // 값만 비교 (==)
    println("c == d ? ${c == d}")
    // 참조주소만 비교 (===)
    println("c === d ? ${c === d}")
}