package br.com.design.theme.button.holder

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import br.com.design.theme.OrionTheme
import br.com.design.theme.button.type.ButtonStyle
import br.com.design.theme.button.type.ButtonType

internal object OrionButtonHolder {

    var type: ButtonType = ButtonType.PRIMARY
    var style: ButtonStyle = ButtonStyle.FILLED

    @Composable
    fun Init(type: ButtonType, style: ButtonStyle) {
        this.type = type
        this.style = style
    }

    @Composable
    fun buttonShape() = RoundedCornerShape(size = OrionTheme.border.borderThick)

    @Composable
    fun buttonBorder(): BorderStroke? {
        val border = when (style) {
            ButtonStyle.OUTLINED -> BorderStroke(
                width = OrionTheme.border.borderThin,
                color = when (type) {
                    ButtonType.PRIMARY -> MaterialTheme.colorScheme.primary
                    ButtonType.SECONDARY -> MaterialTheme.colorScheme.secondary
                    ButtonType.TERTIARY -> MaterialTheme.colorScheme.tertiary
                }
            )

            else -> null
        }

        return border
    }

    @Composable
    fun buttonColors(): ButtonColors {
        val colors = when (type) {
            ButtonType.PRIMARY -> when (style) {
                ButtonStyle.FILLED -> ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.onPrimary
                )

                ButtonStyle.OUTLINED -> ButtonDefaults.outlinedButtonColors(
                    containerColor = Color.Companion.Transparent,
                    contentColor = MaterialTheme.colorScheme.primary,
                    disabledContainerColor = Color.Companion.Transparent
                )

                ButtonStyle.TEXT -> ButtonDefaults.textButtonColors(
                    containerColor = Color.Companion.Transparent,
                    contentColor = MaterialTheme.colorScheme.primary,
                    disabledContainerColor = Color.Companion.Transparent
                )
            }

            ButtonType.SECONDARY -> when (style) {
                ButtonStyle.FILLED -> ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.secondary,
                    contentColor = MaterialTheme.colorScheme.onSecondary
                )

                ButtonStyle.OUTLINED -> ButtonDefaults.outlinedButtonColors(
                    containerColor = Color.Companion.Transparent,
                    contentColor = MaterialTheme.colorScheme.secondary,
                    disabledContainerColor = Color.Companion.Transparent
                )

                ButtonStyle.TEXT -> ButtonDefaults.textButtonColors(
                    containerColor = Color.Companion.Transparent,
                    contentColor = MaterialTheme.colorScheme.secondary,
                    disabledContainerColor = Color.Companion.Transparent
                )
            }

            ButtonType.TERTIARY -> when (style) {
                ButtonStyle.FILLED -> ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.tertiary,
                    contentColor = MaterialTheme.colorScheme.onTertiary
                )

                ButtonStyle.OUTLINED -> ButtonDefaults.outlinedButtonColors(
                    containerColor = Color.Companion.Transparent,
                    contentColor = MaterialTheme.colorScheme.tertiary,
                    disabledContainerColor = Color.Companion.Transparent
                )

                ButtonStyle.TEXT -> ButtonDefaults.textButtonColors(
                    containerColor = Color.Companion.Transparent,
                    contentColor = MaterialTheme.colorScheme.tertiary,
                    disabledContainerColor = Color.Companion.Transparent
                )
            }
        }

        return colors
    }

    @Composable
    fun buttonElevation(): ButtonElevation {
        val elevation = when (style) {
            ButtonStyle.FILLED -> ButtonDefaults.buttonElevation(
                defaultElevation = OrionTheme.elevation.elevationSmall,
                pressedElevation = OrionTheme.elevation.elevationLarge,
                focusedElevation = OrionTheme.elevation.elevationSmall,
                hoveredElevation = OrionTheme.elevation.elevationMedium,
                disabledElevation = OrionTheme.elevation.none
            )

            ButtonStyle.OUTLINED -> ButtonDefaults.buttonElevation(
                defaultElevation = OrionTheme.elevation.none,
                pressedElevation = OrionTheme.elevation.none,
                focusedElevation = OrionTheme.elevation.none,
                hoveredElevation = OrionTheme.elevation.none,
                disabledElevation = OrionTheme.elevation.none
            )

            ButtonStyle.TEXT -> ButtonDefaults.buttonElevation(
                defaultElevation = OrionTheme.elevation.none,
                pressedElevation = OrionTheme.elevation.none,
                focusedElevation = OrionTheme.elevation.none,
                hoveredElevation = OrionTheme.elevation.none,
                disabledElevation = OrionTheme.elevation.none
            )
        }

        return elevation
    }
}