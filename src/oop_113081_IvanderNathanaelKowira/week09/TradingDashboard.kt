package oop_113081_IvanderNathanaelKowira.week09

fun main() {

    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 15, 8.1, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 20, -10.0, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 5, 12.3, "OPEN"),
        TradeLog("BTCUSDT", "LONG", 25, -2.5, "OPEN")
    )

    // Pipeline 1: Ekstraksi Data Valid (Filter):
    val closedTrades = tradeHistory
        .filter { it.status == "CLOSED" }

    // Pipeline 2: Memisahkan Winning Trades:
    val winningTrades = closedTrades
        .filter { it.roe > 0 }

    // Pipeline 3: Memisahkan Losing Trades:
    val losingTrades = closedTrades
        .filter { it.roe <= 0 }


}