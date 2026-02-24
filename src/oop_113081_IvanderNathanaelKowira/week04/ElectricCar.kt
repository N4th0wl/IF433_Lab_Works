package oop_113081_IvanderNathanaelKowira.week04

class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int): Car(brand, numberOfDoors) {
    // FINAL override dimana tidak bisa dioverride lagi oleh child berikutnya
    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }
}