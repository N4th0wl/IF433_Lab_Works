package oop_113081_IvanderNathanaelKowira.week03

class Employee(name: String) {
    var salary: Int = 0
        set(value) {
            if(value < 0) {
                println("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
                field = 0 // Gunakan field, bukan this.salary
            } else {
                field = value // Gunakan field untuk assign nilai asli
            }
        }

    private var performanceRating: Int = 3

    fun increasePerformance() {
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }

    // Kita tidak buat getter untuk performanceRating. Jadi data ini benar-benar rahasia
    // Kecuali kita buat function khusus untuk print

    fun printStatus() {
        println("Karyawan $name, Rating: $performanceRating")
    }
}