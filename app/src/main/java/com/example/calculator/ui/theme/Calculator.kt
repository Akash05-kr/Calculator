package com.example.calculator.ui.theme

import android.text.Layout.Alignment
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.calculator.CalculatorAction
import com.example.calculator.CalculatorButtons
import com.example.calculator.CalculatorOperetion
import com.example.calculator.CalculatorState

import androidx.compose.ui.Modifier

@Composable
fun Calculator(
    state: CalculatorState,
    modifier: Modifier = Modifier,
    buttonSpacing: Dp = 8.dp,
    onAction: (CalculatorAction) -> Unit
) {
    Box(modifier = Modifier) {
        Column(
            modifier = Modifier.run {
                fillMaxWidth()
                    .align(BottomCenter)
            },
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            Text(
                text = state.number1 + (state.operetion?.symbols ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier.fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Light,
                fontSize = 80.sp,
                color = Color.White,
                maxLines = 2,
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButtons(
                    symbols = "AC",
                    modifier = Modifier.background(LightGray)
                        .aspectRatio(2f)
                        .weight(2f),
                 onClickAction = {
                     CalculatorAction.Clear
                 }
                )
                CalculatorButtons(
                        symbols = "Del",
                        modifier = Modifier.background(LightGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClickAction = {
                            CalculatorAction.Delete
                        }
                    )
                CalculatorButtons(
                    symbols = "/",
                    modifier = Modifier.background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClickAction = {
                        CalculatorAction.Operation(CalculatorOperetion.Divide)
                    }
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButtons(
                    symbols = "7",
                    modifier = Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClickAction = {
                        CalculatorAction.Numbers(7)
                    }
                )
                CalculatorButtons(
                    symbols = "8",
                    modifier = Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClickAction = {
                        CalculatorAction.Numbers(8)
                    }
                )
                CalculatorButtons(
                    symbols = "9",
                    modifier = Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClickAction = {
                        CalculatorAction.Numbers(9)
                    }
                )
                CalculatorButtons(
                    symbols = "X",
                    modifier = Modifier.background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClickAction = {
                        CalculatorAction.Operation(CalculatorOperetion.Multiply)
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButtons(
                    symbols = "4",
                    modifier = Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClickAction = {
                        CalculatorAction.Numbers(4)
                    }
                )
                CalculatorButtons(
                    symbols = "5",
                    modifier = Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClickAction = {
                        CalculatorAction.Numbers(5)
                    }
                )
                CalculatorButtons(
                    symbols = "6",
                    modifier = Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClickAction = {
                        CalculatorAction.Numbers(6)
                    }
                )
                CalculatorButtons(
                    symbols = "-",
                    modifier = Modifier.background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClickAction = {
                        CalculatorAction.Operation(CalculatorOperetion.Subtract)
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButtons(
                    symbols = "1",
                    modifier = Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClickAction = {
                        CalculatorAction.Numbers(1)
                    }
                )
                CalculatorButtons(
                    symbols = "2",
                    modifier = Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClickAction = {
                        CalculatorAction.Numbers(2)
                    }
                )
                CalculatorButtons(
                    symbols = "3",
                    modifier = Modifier.background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClickAction = {
                        CalculatorAction.Numbers(3)
                    }
                )
                CalculatorButtons(
                    symbols = "+",
                    modifier = Modifier.background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClickAction = {
                        CalculatorAction.Operation(CalculatorOperetion.Add)
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButtons(
                    symbols = "0",
                    modifier = Modifier.background(LightGray)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClickAction = {
                        CalculatorAction.Numbers(0)
                    }
                )
                CalculatorButtons(
                    symbols = ".",
                    modifier = Modifier.background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClickAction = {
                        CalculatorAction.Decimal
                    }
                )
                CalculatorButtons(
                    symbols = "=",
                    modifier = Modifier.background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClickAction = {
                        CalculatorAction.Calculate
                    }
                )
            }
        }

    }

}