package oop_113081_IvanderNathanaelKowira.week13

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
    val parts = line.split(",")
    return TradeRecord(
        id = parts[0].trim().toInt(),
        symbol = parts[1].trim(),
        type = parts[2].trim(),
        margin = parts[3].trim().toDouble(),
        pnl = parts[4].trim().toDouble()
    )
}