package kr.revelope.kotlin.chap02.section2

fun main() {
    val num = 10
    val formattedString = """
fun main() {
    var a = 6
    var b = "Kotlin"
    println(a + num) // num 값은 $num
}
    """

    println(formattedString)
}