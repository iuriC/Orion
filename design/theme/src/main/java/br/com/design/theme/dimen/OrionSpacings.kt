package br.com.design.theme.dimen

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class OrionSpacings(
    val spacingSmall: Dp = 4.dp,
    val spacingMedium: Dp = 8.dp,
    val spacingLarge: Dp = 16.dp,
    val spacingXLarge: Dp = 20.dp,
)

val LocalOrionSpacings = staticCompositionLocalOf {
    OrionSpacings()
}