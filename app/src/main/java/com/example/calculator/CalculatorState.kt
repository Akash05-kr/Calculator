package com.example.calculator

import androidx.compose.ui.graphics.drawscope.Stroke

data class CalculatorState(
    val number1: String ="",
    val  number2: String="",
    val operetion: CalculatorOperetion?= null
)
