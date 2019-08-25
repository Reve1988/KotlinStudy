package kr.revelope.kotlin.chap02.section4

fun main() {
    var x = 4
    var y = 0b0000_1010 // 10진수 5
    var z = 0x0F // 10진수 15

    println("x shl 2 -> ${x shl 2}") // 16 : 왼쪽으로 2bits 이동 (부호있음)
    println("x.inv() -> ${x.inv()}") // -5 : 비트 뒤집기

    println("y shr 2 -> ${y / 4}, ${y shr 2}") // 2, 2 : 오른쪽으로 2bits 이동 (부호있음)
    println("x shl 4 -> ${x * 16}, ${y shl 2}") // 64, 64 : 왼쪽으로 2bits 이동 (부호있음)
    println("z shl 4 -> ${z * 16}, ${y shl 2}") // 240, 240 : 왼쪽으로 2bits 이동 (부호있음)

    x = 64
    println("x shr 4 -> ${x / 4}, ${x shr 2}") // 16, 16
}