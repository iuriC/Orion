package br.com.design.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import br.com.design.theme.dimen.LocalOrionBorders
import br.com.design.theme.dimen.LocalOrionDimens
import br.com.design.theme.dimen.LocalOrionElevations
import br.com.design.theme.dimen.LocalOrionSpacings
import br.com.design.theme.dimen.OrionBorders
import br.com.design.theme.dimen.OrionDimens
import br.com.design.theme.dimen.OrionElevations
import br.com.design.theme.dimen.OrionSpacings
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

object OrionTheme {
    val dimen: OrionDimens
        @Composable get() = LocalOrionDimens.current

    val elevation: OrionElevations
        @Composable get() = LocalOrionElevations.current

    val border: OrionBorders
        @Composable get() = LocalOrionBorders.current

    val spacing: OrionSpacings
        @Composable get() = LocalOrionSpacings.current
}
