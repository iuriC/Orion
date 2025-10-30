package br.com.design.theme.dimen

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class OrionDimens(
    val none: Dp = 0.dp,
    val sizeXs: Dp = 2.dp,
    val sizeSm: Dp = 4.dp,
    val sizeMd: Dp = 8.dp,
    val sizeLg: Dp = 16.dp,
    val sizeXl: Dp = 24.dp,
    val sizeXxl: Dp = 32.dp,
    val sizeHugeXs: Dp = 48.dp,
    val sizeHugeSm: Dp = 64.dp,
    val sizeHugeMd: Dp = 96.dp,
    val sizeHugeLg: Dp = 128.dp,
    val sizeHugeXl: Dp = 160.dp,
    val sizeHugeXxl: Dp = 200.dp,
    val sizeMassiveXs: Dp = 240.dp,
    val sizeMassiveSm: Dp = 300.dp,
    val sizeMassiveMd: Dp = 360.dp,
)

val LocalOrionDimens = staticCompositionLocalOf {
    OrionDimens()
}