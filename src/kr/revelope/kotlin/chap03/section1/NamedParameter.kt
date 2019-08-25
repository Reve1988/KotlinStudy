package kr.revelope.kotlin.chap03.section1

fun main() {
    namedParam() // 600
    namedParam(1000) // 1500
    namedParam(1000, 1000) // 2300
    namedParam(1000, 1000, 1000) // 3000

    namedParam(x = 1000) // 1500
    namedParam(y = 1000) // 1400
    namedParam(z = 1000) // 1300
}

fun namedParam(x: Int = 100, y: Int = 200, z: Int = 300) {
    println(x + y + z)
}