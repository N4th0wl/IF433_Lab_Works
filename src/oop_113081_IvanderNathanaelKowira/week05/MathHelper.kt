package oop_113081_IvanderNathanaelKowira.week05

class MathHelper {
    // Luas Persegi / kotak lah kotak wok
    fun hitungLuas(sisi: Int): Int {
        return sisi * sisi
    }

    // Luas Persegi Panjang
    fun hitungLuas(panjang: Int, lebar: Int): Int {
        return panjang * lebar
    }

    // Luas Lingkaran
    fun hitungLuas(jarijari: Double): Double {
        return 3.14 * jarijari * jarijari
    }
}