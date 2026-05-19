package oop_113081_IvanderNathanaelKowira.week13

import java.io.File
import java.io.FileNotFoundException

data class Student(val name: String, val age: Int, val gpa: Double)

// Serialization (Object -> CSV)
fun Student.toCsv(): String = "$name,$age,$gpa"

// Deserialization (CSV -> Object)
fun fromCsv(line: String): Student {
    val parts = line.split(",")
    return Student(parts[0], parts[1].toInt(), parts[2].toDouble())
}

// Fungsi untuk menyimpan seluruh daftar student ke file file teks
fun saveStudents(students: List<Student>, path: String) {
    File(path).writeText(students.joinToString(separator = "\n") { it.toCsv() })
}

// Fungsi untuk memuat data dari file kembali menjadi List<Student>
fun loadStudents(path: String): List<Student> {
    return try {
        File(path).readLines().map { fromCsv(line = it) }
    } catch (e: FileNotFoundException) {
        println("Error: File tidak ditemukan!")
        emptyList()
    }
}
