package br.com.design.theme.dimen

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class OrionBorders(
    val borderThin: Dp = 1.dp,
    val borderNormal: Dp = 2.dp,
    val borderThick: Dp = 4.dp,
)

val LocalOrionBorders = staticCompositionLocalOf {
    OrionBorders()
}