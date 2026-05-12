package oop_113081_IvanderNathanaelKowira.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}


fun main() {
    var currentKibbleStock = 50

    println("==== JADWAL MAKAN 1 (PAGI) ====")
    try {
        currentKibbleStock = dispenseKibble(requestedGram = 80, availableGram = currentKibbleStock, isJammed = false)
    } catch (e: DispenserJamException) {
        println("Caught Hardware Error: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Caught Domain Error: ${e.message}")
    } catch (e: Exception) {
        println("Caught General Error: Terjadi kesalahan tidak terduga, ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }

    println("\n==== JADWAL MAKAN SORE ====")
    runCatching {
        dispenseKibble(requestedGram = 30, availableGram = 1000, isJammed = false)
    }.onSuccess { newStock ->
        currentKibbleStock = newStock
        println("Makan sore berhasil! Sisa stock Kibble: $ $currentKibbleStock gr")
    }
}