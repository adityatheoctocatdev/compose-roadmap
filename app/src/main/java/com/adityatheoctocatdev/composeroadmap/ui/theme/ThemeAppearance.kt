package com.adityatheoctocatdev.composeroadmap.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

object ThemeAppearance {
    private val darkColorPalette = darkColors(
        primary = ColorAppearance.purple200,
        primaryVariant = ColorAppearance.purple700,
        secondary = ColorAppearance.teal200
    )

    private val lightColorPalette = lightColors(
        primary = ColorAppearance.purple500,
        primaryVariant = ColorAppearance.purple700,
        secondary = ColorAppearance.teal200
    )

    @Composable
    fun ComposeRoadmapTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
        val colors = if (darkTheme) {
            this.darkColorPalette
        } else {
            this.lightColorPalette
        }

        MaterialTheme(
            colors = colors,
            typography = TypeAppearance.typography,
            shapes = ShapeAppearance.shapes,
            content = content
        )
    }
}