package br.com.design.theme.holder

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import br.com.design.theme.dimen.OrionDimens
import br.com.design.theme.token.OrionTokens

internal object OrionHolder {

    var typography: Typography = OrionTokens.Typography.value()
    var colorScheme: ColorScheme = OrionTokens.ColorScheme.light()

    @Composable
    fun Init() {
        colorScheme = if (isSystemInDarkTheme()) {
            OrionTokens.ColorScheme.dark()
        } else {
            OrionTokens.ColorScheme.light()
        }
    }
}