package kr.revelope.kotlin

import kotlin.math.PI
import kotlin.math.abs

import kr.revelope.kotlin.Person
import kr.revelope.kotlin.Person as User

fun main() {
    ex1()
    ex2()
}

fun ex1() {
    val intro: String = "안녕하세요!"
    val num: Int = 20

    println("intro: $intro, num: $num")

    println(PI)
    println(abs(-12.6))
}

fun ex2() {
    val user1 = User("길동", 30)
    val user2 = Person("둘리", 3000)

    println(user1.name)
    println(user1.age)

    println(user2.name)
    println(user2.age)
}