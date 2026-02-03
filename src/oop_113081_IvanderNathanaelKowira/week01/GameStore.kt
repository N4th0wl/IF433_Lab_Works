package oop_113081_IvanderNathanaelKowira.week01

fun main() {
    val gameTitle: String = "OOP LAB MENYENANGKAN"
    val price: Int = 650000 // Harga 1 SKS

    val finalPrice: Int = calculatedDiscount(price)

    printReceipt(title = gameTitle, finalPrice = finalPrice)
}

fun calculatedDiscount(price: Int) = if (price > 500000) price * 80 / 100 else price * 90 / 100

fun printReceipt(title: String, finalPrice: Int) {
    println("======= STEAMWOKWOK =======")
    println("--------- by Ivan ---------")
    println("Judul Game: $title")
    println("Harga Akhir: Rp. $finalPrice")
    println("===========================")
}
