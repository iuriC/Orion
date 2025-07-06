package br.com.design.theme.token.color

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme

internal object OrionColors {
    fun light(): ColorScheme = lightColorScheme(
        primary = LightColors.Primary,
        onPrimary = LightColors.OnPrimary,
        primaryContainer = LightColors.PrimaryContainer,
        onPrimaryContainer = LightColors.OnPrimaryContainer,
        inversePrimary = LightColors.InversePrimary,
        secondary = LightColors.Secondary,
        onSecondary = LightColors.OnSecondary,
        secondaryContainer = LightColors.SecondaryContainer,
        onSecondaryContainer = LightColors.OnSecondaryContainer,
        background = LightColors.Background,
        onBackground = LightColors.OnBackground,
        surface = LightColors.Surface,
        onSurface = LightColors.OnSurface,
        surfaceVariant = LightColors.SurfaceVariant,
        onSurfaceVariant = LightColors.OnSurfaceVariant,
        surfaceTint = LightColors.Primary,
        inverseSurface = LightColors.InverseSurface,
        inverseOnSurface = LightColors.InverseOnSurface,
        error = LightColors.Error,
        onError = LightColors.OnError,
        errorContainer = LightColors.ErrorContainer,
        onErrorContainer = LightColors.OnErrorContainer,
        outline = LightColors.Outline,
        outlineVariant = LightColors.OutlineVariant,
        scrim = LightColors.Scrim
    )

    fun dark(): ColorScheme = darkColorScheme(
        primary = DarkColors.Primary,
        onPrimary = DarkColors.OnPrimary,
        primaryContainer = DarkColors.PrimaryContainer,
        onPrimaryContainer = DarkColors.OnPrimaryContainer,
        inversePrimary = DarkColors.InversePrimary,
        secondary = DarkColors.Secondary,
        onSecondary = DarkColors.OnSecondary,
        secondaryContainer = DarkColors.SecondaryContainer,
        onSecondaryContainer = DarkColors.OnSecondaryContainer,
        onBackground = DarkColors.OnBackground,
        surface = DarkColors.Surface,
        onSurface = DarkColors.OnSurface,
        surfaceVariant = DarkColors.SurfaceVariant,
        onSurfaceVariant = DarkColors.OnSurfaceVariant,
        surfaceTint = DarkColors.Primary,
        inverseSurface = DarkColors.InverseSurface,
        inverseOnSurface = DarkColors.InverseOnSurface,
        error = DarkColors.Error,
        onError = DarkColors.OnError,
        errorContainer = DarkColors.ErrorContainer,
        onErrorContainer = DarkColors.OnErrorContainer,
        outline = DarkColors.Outline,
        outlineVariant = DarkColors.OutlineVariant,
        scrim = DarkColors.Scrim
    )
}