package oop_113081_IvanderNathanaelKowira.week07

class NetworkClient private constructor(val url: String){
    fun connect() {
        println("Connecting to $url...")
    }
}