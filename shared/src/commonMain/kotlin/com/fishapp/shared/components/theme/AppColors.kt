package com.fishapp.shared.components.theme

import androidx.compose.ui.graphics.Color

data class AppColors(
    private val color: Color
)
{
    fun getColor() = color
    companion object{
        val primary = AppColors(Color(0xFF425C7A))
        val primaryContainer = AppColors(Color(0xFFC9D6E5))
        val secondary = AppColors(Color(0xFF7A96B8))
        val background = AppColors(Color(0xFFEEF2F6))
        val surface = AppColors(Color.White)
        val textPrimary = AppColors(Color(0xFF1C2733))
        val textSecondary = AppColors(Color(0xFF425C7A))
        fun custom(color: Long)=
            AppColors(Color(color))

    }
}