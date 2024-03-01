package com.mexiti.costogasolina

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import com.mexiti.costogasolina.ui.theme.CostoGasolinaTheme
import org.junit.Rule
import org.junit.Test
import java.text.NumberFormat

class CalcularMonto2UITest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun CalcularMonto22_35_40l(){
        composeTestRule.setContent {
            CostoGasolinaTheme {
                CostGasLayout()
            }
        }
        composeTestRule.onNodeWithText("Ingresa precio por litro de Gasolina")
            .performTextInput("22.35")
        composeTestRule.onNodeWithText("Litros")
            .performTextInput("40")

        val montoEsperado = NumberFormat.getCurrencyInstance().format(894)

        composeTestRule.onNodeWithText("Monto Total: $montoEsperado").
        assertExists("No se encontró ningún nodo con este texto")
    }
}