package oop_113081_IvanderNathanaelKowira.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}