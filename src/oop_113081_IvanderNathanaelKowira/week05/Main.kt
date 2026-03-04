package oop_113081_IvanderNathanaelKowira.week05

fun main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    // Polymorphic Collection: List yang berisi tipe Parent, tapi isinya objek Anak
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for(pegawai in daftarPegawai) {
        // Pemanggilan Runtime Polymorphism
        pegawai.bekerja()

        // pegawai.mengajar() // INI AKAN ERROR karena tipe referensinya adalah pegawai

        // Smart Casting dengan is dan when
        when(pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("------------------------------------")
    }

    // Bagian Tugas1 : MathHelper.kt
    val mathHelper = MathHelper()

    val luasPersegi = mathHelper.hitungLuas(3)
    val luasPersegiPanjang = mathHelper.hitungLuas(4,5)
    val luasLingkaran = mathHelper.hitungLuas(7.0)

    println("=== Perhitungan Luas ===")
    println("Luas Persegi: $luasPersegi")
    println("Luas Persegi Panjang: $luasPersegiPanjang")
    println("Luas Lingkaran: $luasLingkaran")

    /*
    println("Luas Persegi: ${mathHelper.hitungLuas(3)}")
    println("Luas Persegi Panjang: ${mathHelper.hitungLuas(4, 6)}")
    println("Luas Lingkaran: ${mathHelper.hitungLuas(7.0)}")
    */

    println("------------------------------------")


}