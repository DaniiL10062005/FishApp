package com.fishapp.shared.components.AppButton

import androidx.compose.ui.unit.Dp
import com.fishapp.shared.components.theme.AppSpacing

data class AppButtonSize (
    private val horizontalPadding: AppSpacing,
    private val verticalPadding: AppSpacing
) {

    fun getHorizontal() = horizontalPadding
    fun getVertical() = verticalPadding
    companion object{
        val small = AppButtonSize(
            AppSpacing.xl,
            AppSpacing.m
        )
        val medium = AppButtonSize (
            AppSpacing.xxxl,
            AppSpacing.l
        )
        val large = AppButtonSize (
            AppSpacing.biggest,
            AppSpacing.xl
        )
        fun custom(horizontal: Dp, vertical: Dp) = AppButtonSize(
            AppSpacing.custom(horizontal),
            AppSpacing.custom(vertical)
        )
    }
}