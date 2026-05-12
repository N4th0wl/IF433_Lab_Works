package oop_113081_IvanderNathanaelKowira.week12

fun main() {
    println("===== TEST RUN CATCHING =====")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }

    // Pattern: getOrElse
    val safeValue = result.getOrElse { -1 }
    println("Safe Value (getOrElse): $safeValue")

    // Pattern: recover (bisa mengubah tipe kegagalan menjadi sukses)
    val recovered = result.recover { 0 }.getOrNull()
    println("Recovered Value: $recovered")
}