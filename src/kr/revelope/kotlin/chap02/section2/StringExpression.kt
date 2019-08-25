package kr.revelope.kotlin.chap02.section2

fun main() {
    val a = 1
    val str1 = "a = $a"
    val str2 = "a = ${a + 2}"

    println("str1 : \"$str1\", str2 : \"$str2\"")
    println("I have \$15.")
    println("${'"'}${'$'}9.99${'"'}")
}