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