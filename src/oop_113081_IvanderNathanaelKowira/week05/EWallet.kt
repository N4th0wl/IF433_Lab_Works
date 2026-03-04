package oop_113081_IvanderNathanaelKowira.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran Berhasil Menggunakan EWallet milik $accountName")
            println("Sisa saldo: $balance")
        } else {
            println("Saldo tidak cukup")
        }
    }

    fun topUp(amount:Double) {
        balance += amount
        println("Top Up Berhasil. Saldo sekarang: $balance")
    }
}