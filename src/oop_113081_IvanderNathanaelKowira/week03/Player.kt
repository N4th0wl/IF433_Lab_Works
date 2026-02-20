package oop_113081_IvanderNathanaelKowira.week03

class Player(val username: String) {
    // XP tidak bisa diakses atau diubah langsung dari luar class
    private var xp: Int = 0
    // Computed property
    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount <= 0) {
            println("XP yang ditambahkan harus bernilai positif!")
            return
        }

        val oldLevel = level
        xp += amount
        val newLevel = level

        if (newLevel > oldLevel) {
            println("Level Up! Selamat $username naik ke level $newLevel")
        }
    }
}