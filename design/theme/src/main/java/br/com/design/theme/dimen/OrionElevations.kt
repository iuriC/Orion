package br.com.design.theme.dimen

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class OrionElevations(
    val none: Dp = 0.dp,
    val elevationSmall: Dp = 2.dp,
    val elevationMedium: Dp = 4.dp,
    val elevationLarge: Dp = 8.dp,
)

val LocalOrionElevations = staticCompositionLocalOf {
    OrionElevations()
}