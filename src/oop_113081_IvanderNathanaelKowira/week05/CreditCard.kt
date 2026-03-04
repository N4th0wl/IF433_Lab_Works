package oop_113081_IvanderNathanaelKowira.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran berhasil menggunakan Credit Card milik $accountName")
            println("Total penggunaan kartu: $usedAmount")
        } else {
            println("Transaksi ditolak. Melebihi limit kartu.")
        }
    }
}