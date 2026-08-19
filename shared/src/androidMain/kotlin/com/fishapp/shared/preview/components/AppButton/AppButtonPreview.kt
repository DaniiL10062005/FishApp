package com.fishapp.shared.preview.components.AppButton

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.fishapp.shared.components.AppButton.AppButton
import com.fishapp.shared.components.theme.AppColors
import com.fishapp.shared.components.theme.AppContainerPaddingSize
import com.fishapp.shared.components.theme.AppRadius
import com.fishapp.shared.components.theme.AppSpacing
import com.fishapp.shared.components.theme.AppTypography

@Preview(showBackground = true)
@Composable
private fun AppButtonPreview() {
    Column {
        AppButton(
            text = "Маленькая",
            onClick = {},
            verticalPadding = AppSpacing.s,
            horizontalPadding = AppSpacing.s,
            enabled = true,
            borderWidth = null,
            borderColor = AppColors.textPrimary,
            padding = AppContainerPaddingSize.small,
            radius = AppRadius.xl,
            textStyle = AppTypography.p
        )
        AppButton(
            text = "Средняя",
            onClick = {},
            verticalPadding = AppSpacing.m,
            horizontalPadding = AppSpacing.m,
            enabled = true,
            borderWidth = AppSpacing.border,
            borderColor = AppColors.textPrimary,
            padding = AppContainerPaddingSize.medium,
            radius = AppRadius.xl,
            textStyle = AppTypography.h4
        )
        AppButton(
            text = "Большая",
            onClick = {},
            verticalPadding = AppSpacing.l,
            horizontalPadding = AppSpacing.l,
            enabled = true,
            borderWidth = AppSpacing.border,
            borderColor = AppColors.textPrimary,
            padding = AppContainerPaddingSize.large,
            radius = AppRadius.xxl,
            textStyle = AppTypography.h3
        )
    }

}