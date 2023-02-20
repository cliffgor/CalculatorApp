package com.cliff.calculator

sealed class CalculatorOperation(val symbol: String) {
    object Add: CalculatorOperation("+")
    object Subract: CalculatorOperation("-")
    object Mutliply: CalculatorOperation("x")
    object Divide: CalculatorOperation("/")


}
