package oop_113081_IvanderNathanaelKowira.week01

fun main(args: Array<String>) {
    // Variable definition
    val radius  = 7.0
    val pi  = 3.14

    // Calculation
    val area = pi * radius * radius

    // Output concatenation
    println("Radius: $radius, Area: $area")
    // Logic check
    checkSize(area)
}

fun checkSize(area: Double) {
    if(area > 100) {
        println("This is a Big Circle!")
    } else {
        println("This is a Small Circle")
    }
}