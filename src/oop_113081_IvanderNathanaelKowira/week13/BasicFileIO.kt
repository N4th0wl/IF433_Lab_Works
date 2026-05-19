package oop_113081_IvanderNathanaelKowira.week13

import java.io.File

fun main() {
    println("==== TEST WRITE TEXT ====")
    val file = File("notes.txt")
    file.writeText("Line 1: Inisialisasi sistem. \n")
    println("FIle berhasil dibuat dan ditulis")

}
