package oop_113081_IvanderNathanaelKowira.week12

fun main() {
    println("===== TEST RUNCATCHING =====")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
}