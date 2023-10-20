package ru.kheynov.crosswordle.core.ui

import androidx.appcompat.app.AppCompatDelegate
import ru.kheynov.crosswordle.R

enum class UiTheme(val value: Int, val title: UiText) {
    DARK(
        AppCompatDelegate.MODE_NIGHT_YES,
        UiText.StringResource(R.string.dark_theme_name),
    ),
    LIGHT(
        AppCompatDelegate.MODE_NIGHT_NO,
        UiText.StringResource(R.string.light_theme_name),
    ),
    SYSTEM(
        AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM,
        UiText.StringResource(R.string.system_theme_name),
    );

    companion object {
        fun parseTheme(value: Int) =
            when (value) {
                AppCompatDelegate.MODE_NIGHT_YES -> DARK
                AppCompatDelegate.MODE_NIGHT_NO -> LIGHT
                AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM -> SYSTEM
                else -> error("Unable to parse theme")
            }
    }
}