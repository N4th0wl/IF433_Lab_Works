package oop_113081_IvanderNathanaelKowira.week11

fun main() {
    println("===== TEST EXTENSION FUNCTIONS =====")
    println("Alex".addGreeting())
    println("Hi".repeatTimes(3))

    val text:String? = null
    println("Apakah null/empty? ${text.isNullOrEmptyCustom()}")
}