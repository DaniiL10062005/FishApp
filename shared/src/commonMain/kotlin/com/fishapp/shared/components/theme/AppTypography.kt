package com.fishapp.shared.components.theme

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

data class AppTypography(
    private val size: TextUnit,
    private val weight: FontWeight
)
{
    fun getTypographySize() = size
    fun getTypographyWeight() = weight
    companion object{
        val p = AppTypography(
            size = 16.sp,
            weight = FontWeight.Normal
        )

        val h1 = AppTypography(
            size = 32.sp,
            weight = FontWeight.Bold
        )

        val h2 = AppTypography(
            size = 28.sp,
            weight = FontWeight.Bold
        )

        val h3 = AppTypography(
            size = 24.sp,
            weight = FontWeight.Bold
        )
        val h4 = AppTypography(
            size = 20.sp,
            weight = FontWeight.SemiBold
        )
    }

}
