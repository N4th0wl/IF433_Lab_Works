package oop_113081_IvanderNathanaelKowira.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Ontel")
    generalVehicle.honk()
    generalVehicle .accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk() // Memanggil method milik sendiri
    myCar.honk() // Memanggil method yang sudah di override
    myCar.accelerate() // Memanggil gabungan method Parent dan Child

    println("\n---- Testing Electric Car ----")
    val tesla = ElectricCar("Tesla", 4, 95)
    tesla.openTrunk()
    tesla.honk()
    tesla.accelerate()
}