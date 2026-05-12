package oop_113081_IvanderNathanaelKowira.week12

sealed class FeederExceptions(msg: String) : Exception(msg)

class FoodEmptyException(requested: Int, available: Int) :
    FeederExceptions("Kibble tidak cukup! Diminta $requested gr, sisa $available gr")

class DispenserJamException :
    FeederExceptions("Wadah dispenser tersangkut/macet!")