package com.fishapp.shared.components.theme
import androidx.compose.ui.unit.Dp
import com.fishapp.shared.components.theme.AppSpacing

data class AppContainerPaddingSize private constructor(
    private val horizontalPadding: AppSpacing,
    private val verticalPadding: AppSpacing
) {

    fun getHorizontal() = horizontalPadding
    fun getVertical() = verticalPadding
    companion object{
        val small = AppContainerPaddingSize(
            AppSpacing.xl,
            AppSpacing.m
        )
        val medium = AppContainerPaddingSize (
            AppSpacing.xxxl,
            AppSpacing.l
        )
        val large = AppContainerPaddingSize (
            AppSpacing.biggest,
            AppSpacing.xl
        )
    }
}