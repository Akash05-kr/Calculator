package com.example.calculator

import android.app.Notification.Action
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.calculator.ui.theme.Calculator

class CalculatorViewModel : ViewModel(){

    var state by mutableStateOf(CalculatorState())
        private set

            fun onAction(action: CalculatorAction) {
                when(action) {
                    is CalculatorAction.Numbers -> enterNumber(action.number)
                    is CalculatorAction.Delete -> delete()
                    is CalculatorAction.Clear -> state = CalculatorState()
                    is CalculatorAction.Operation -> enterOperation(action.operation)
                    is CalculatorAction.Decimal -> enterDecimal()
                    is CalculatorAction.Calculate -> calculate()
                }
            }

            private fun enterOperation(operation: CalculatorOperetion) {
                if(state.number1.isNotBlank()) {
                    state = state.copy(operetion = operation)
                }
            }

            private fun calculate() {
                val number1 = state.number1.toDoubleOrNull()
                val number2 = state.number2.toDoubleOrNull()
                if(number1 != null && number2 != null) {
                    val result = when(state.operetion) {
                        is CalculatorOperetion.Add -> number1 + number2
                        is CalculatorOperetion.Subtract -> number1 - number2
                        is CalculatorOperetion.Multiply -> number1 * number2
                        is CalculatorOperetion.Divide -> number1 / number2

                        else -> {return}
                    }
                    state = state.copy(
                        number1 = result.toString().take(15),
                        number2 = "",
                        operetion = null
                    )
                }
            }

            private fun delete() {
                when {
                    state.number2.isNotBlank() -> state = state.copy(
                        number2 = state.number2.dropLast(1)
                    )
                    state.operetion != null -> state = state.copy(
                       operetion = null
                    )
                    state.number1.isNotBlank() -> state = state.copy(
                        number1 = state.number1.dropLast(1)
                    )
                }
            }

            private fun enterDecimal() {
                if(state.operetion == null && !state.number1.contains(".") && state.number1.isNotBlank()) {
                    state = state.copy(
                        number1 = state.number1 + "."
                    )
                    return
                } else if(!state.number2.contains(".") && state.number2.isNotBlank()) {
                    state = state.copy(
                        number2 = state.number2 + "."
                    )
                }
            }

            private fun enterNumber(number: Int) {
                if(state.operetion == null) {
                    if(state.number1.length >= MAX_NUM_LENGTH) {
                        return
                    }
                    state = state.copy(
                        number1 = state.number1 + number
                    )
                    return
                }
                if(state.number2.length >= MAX_NUM_LENGTH) {
                    return
                }
                state = state.copy(
                    number2 = state.number2 + number
                )
            }

            companion object {
                private const val MAX_NUM_LENGTH = 8
            }

            }
