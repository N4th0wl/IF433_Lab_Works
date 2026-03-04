package oop_113081_IvanderNathanaelKowira.week05

class Dosen(nama: String, val nidn: String): Pegawai(nama) {
    // WAJIB di override karena fungsi bekerja() abstract di Parent
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RPKPS.")
    }

    // Fungsi unik/spesifik yang hanya dimiliki Dosen
    fun mengajar() {
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}