package com.example.calculator

import java.text.DateFormatSymbols

sealed class CalculatorOperetion(val symbols: String) {
    object Add: CalculatorOperetion("+")
    object Subtract: CalculatorOperetion("-")
    object Multiply: CalculatorOperetion("*")
    object Divide: CalculatorOperetion("/")
}