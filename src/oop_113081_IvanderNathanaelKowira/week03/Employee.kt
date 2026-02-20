package oop_113081_IvanderNathanaelKowira.week03

class Employee(name: String) {
    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            // PERINGATAN: KODE DI BAWAH INI SALAH & BERBAHAYA
            // Kita memanggil setter di dalam setter (Recursive)
            this.salary = value
        }
}