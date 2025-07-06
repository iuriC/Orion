package br.com.design.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import br.com.design.theme.holder.OrionHolder

@Composable
fun OrionTheme(
    content: @Composable () -> Unit,
) {
    OrionHolder.Init()

    MaterialTheme(
        colorScheme = OrionHolder.colorScheme,
        typography = OrionHolder.typography,
        content = content
    )
}
