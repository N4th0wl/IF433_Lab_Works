package oop_113081_IvanderNathanaelKowira.week03

class Weapon(val name: String) {
    var damage: Int = 0
        set(value) {
            when {
                value < 0 -> {
                    println("Warning: Damage tidak boleh negatif! Nilai tidak diubah.")
                }
                value > 1000 -> {
                    println("Damage terlalu besar! Diset menjadi 1000 (maksimal).")
                    field = 1000
                }
                else -> {
                    field = value
                }
            }
        }

    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}