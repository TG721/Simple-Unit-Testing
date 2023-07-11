package com.ibsu.basicunittest

class TaxCalculator {

    fun calculateTax(income: Double): Double {
        if(income<=1000){
            return income * 0.05
        }
        else return income * 0.1
    }
}