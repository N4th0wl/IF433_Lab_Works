package oop_113081_IvanderNathanaelKowira.week07

class NetworkClient private constructor(val url: String){
    companion object {
        const val BASE_URL = "https://api.umn.ac.id" // Shared Constant

        fun createClient(): NetworkClient {
            println("Membangun NetworkClient dengan BASE_URL: $BASE_URL")
            return NetworkClient(BASE_URL)
        }
    }

    fun connect() {
        println("Connecting to $url...")
    }
}