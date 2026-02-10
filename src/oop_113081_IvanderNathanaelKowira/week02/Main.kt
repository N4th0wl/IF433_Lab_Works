package oop_113081_IvanderNathanaelKowira.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    scanner.nextLine() // Bersihkan buffer newline

    // Validasi di sisi PEMANGGIL (main)
    if(nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!0")
        // Program berhenti di sini untuk mahasiswa ini, tidak membuat objek
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        // Instansi Objek, karena data sudah aman
        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai.")
    }

    print("Pilih Jalur (1. Reguler, 2. Umum): ")
    val type = scanner.nextInt()
    scanner.nextLine() // Consume newline

    if(type == 1) {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()
        // Memanggil Primary Constructor
        val s1 = Student(name, nim, major)
        println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
    } else if (type == 2) {
        // Memanggil Secondary Constructor, jurusan otomatis "Non-Matriculated"
        val s2 = Student(name, nim)
        println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
    } else {
        println("Pilihan ngawur, pendaftaran batal!")
    }
    // Sistem Peminjaman Buku
    println("\n\n===== SISTEM PEMINJAMAN BUKU WEMEN =====\n")

    print("Masukkan Judul Buku: ")
    val bookTitle: String = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower: String = scanner.nextLine()

    print("Masukkan Lama Pinjam (Hari): ")
    var duration: Int = scanner.nextInt()
    scanner.nextLine()

    // Validasi: Durasi (Hari) tidak boleh minus
    if (duration < 0) {
        duration = 1
    }

    val loan = Loan(bookTitle, borrower, duration)

    println("\n=== Detail Peminjaman ===")
    println("Judul Buku   : ${loan.bookTitle}")
    println("Peminjam     : ${loan.borrower}")
    println("Lama Pinjam  : ${loan.loanDuration} hari")
    println("Total Denda  : Rp ${loan.calculateFine()}")

}