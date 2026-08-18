package com.fishapp.shared.components.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

class AppRadius(
    private val radius: RoundedCornerShape
)
{
    fun getRadius() = radius
    companion object{
        val none = AppRadius(RoundedCornerShape(0.dp))
        val xs = AppRadius(RoundedCornerShape(2.dp))
        val s = AppRadius(RoundedCornerShape(4.dp))
        val m = AppRadius(RoundedCornerShape(8.dp))
        val l = AppRadius(RoundedCornerShape(12.dp))
        val xl = AppRadius(RoundedCornerShape(16.dp))
        val o = AppRadius(RoundedCornerShape(50))
        fun custom(radius:Dp) = AppRadius(RoundedCornerShape(radius))
    }
}