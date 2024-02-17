package com.example.calculator

sealed class CalculatorAction {
    data class Numbers(val number: Int ): CalculatorAction()
    object Clear: CalculatorAction()
    object Delete: CalculatorAction()
    object Decimal: CalculatorAction()
    object Calculate: CalculatorAction()
    data class Operation(val operation:CalculatorOperetion): CalculatorAction()


}