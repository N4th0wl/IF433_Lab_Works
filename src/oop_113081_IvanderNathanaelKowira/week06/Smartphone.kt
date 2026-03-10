package oop_113081_IvanderNathanaelKowira.week06

class Smartphone : Camera, Phone {
    // Manually override to resolve ambiguity
    override fun turnOn() {
        super<Camera>.turnOn() // Menjalankan logika camera
        super<Phone>.turnOn() // Menjalankan logika phone
        println("Sistem operasi Smartphone berhasil booting.")
    }
}