package oop_113081_IvanderNathanaelKowira.week03

fun main() {
    // Dari guided practicum
    /*
    val e = Employee("Budi")
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")
    e.increasePerformance()
    println("Pajak yang harus dibayar: ${e.tax}")
    */

    // Dari TASK 1
    /*val weapon = Weapon("Pedangnya Pak Wirawan")
    // weapon.damage = -50
    weapon.damage = 9999
    println("Damage sekarang: ${weapon.damage}")
    println("Tier senjata: ${weapon.tier}")
     */

    // Dari TASK 2
    val player = Player("Wowo Raja Sawit")

    // ERROR : Hal ini terjadi karena xp bersifat private
    // println(player.xp)

    // Tambah 50 XP, masih level 1
    player.addXp(50)
    println("Level sekarang: ${player.level}")

    // Tambah 60 XP, totalnya jadi 110 XP, naik ke level 2
    player.addXp(60)
    println("Level sekarang: ${player.level}")
}
