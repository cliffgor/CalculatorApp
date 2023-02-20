package com.cliff.calculator

sealed class CalculatorAction {
    data class Number(val number: Int): CalculatorAction()
    object Clear: CalculatorAction()
    object Delete: CalculatorAction()
    object Deciaml: CalculatorAction()
    object Calculate: CalculatorAction()
    data class Operation(val operation: CalculatorOperation): CalculatorAction()
}
