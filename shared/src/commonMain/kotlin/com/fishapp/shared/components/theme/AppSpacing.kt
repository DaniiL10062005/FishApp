package com.fishapp.shared.components.theme

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


data class AppSpacing private constructor(
    private val spacing: Dp
)
{
    fun getSpacing() = spacing
    companion object{
        val none = AppSpacing(0.dp)
        val border = AppSpacing(1.dp)
        val xs = AppSpacing(2.dp)
        val s = AppSpacing(4.dp)
        val m = AppSpacing(8.dp)
        val l = AppSpacing(12.dp)
        val xl = AppSpacing(16.dp)
        val xxl = AppSpacing(20.dp)
        val xxxl = AppSpacing(24.dp)
        val biggest = AppSpacing(32.dp)
    }
}