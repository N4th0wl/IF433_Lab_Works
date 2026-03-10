package oop_113081_IvanderNathanaelKowira.week06

class Button(override val name: String): Clickable {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}