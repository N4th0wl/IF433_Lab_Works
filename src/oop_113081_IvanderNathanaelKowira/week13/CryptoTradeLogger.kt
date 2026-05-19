package oop_113081_IvanderNathanaelKowira.week13

import java.io.File
import java.io.FileNotFoundException

// Data class untuk menampung record transaksi kripto
data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv(): String {
    return "$id,$symbol,$type,$margin,$pnl"
}

fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")
        TradeRecord(
            id = parts[0].trim().toInt(),
            symbol = parts[1].trim(),
            type = parts[2].trim(),
            margin = parts[3].trim().toDouble(),
            pnl = parts[4].trim().toDouble()
        )
    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { trade ->
            writer.println(trade.toCsv())
        }
    }
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File histori transaksi tidak ditemukan!")
        emptyList()
    }
}

fun main() {
    val mockTrades = listOf(
        TradeRecord(1, "BTCUSDT", "Long", 250.0, 85.5),
        TradeRecord(2, "ETHUSDT", "Short", 150.0, -32.0),
        TradeRecord(3, "SOLUSDT", "Long", 100.0, 14.5)
    )

    val filePath = "crypto_trades.csv"
    saveTrades(mockTrades, filePath)
    println("Berhasil menginisialisasi dan menyimpan mock data transaksi.")

    File(filePath).appendText("CORRUPT_ID, DOGEUSDT, Hold, XX ,YY\n")
    println("Data korup (DOGEUSDT) sengaja disuntikkan ke dalam file.")
}