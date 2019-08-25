package kr.revelope.kotlin.chap02.section3

fun main() {
    // 스마트캐스트(smart cast) : 자료형이 명확하지 않을 경우 자동으로 형 변환이 되도록 함

    // 자료형 Number : 어떤 형태의 숫자던 저장이 가능
    // Double형으로 스마트 캐스트
    var num: Number = 12.2
    println("$num")

    // Int형으로 스마트 캐스트
    num = 12
    println("$num")

    // Long형으로 스마트 캐스트
    num = 120L
    println("$num")

    // Float형으로 스마트 캐스트
    num = 12.0f
    println("$num")
}