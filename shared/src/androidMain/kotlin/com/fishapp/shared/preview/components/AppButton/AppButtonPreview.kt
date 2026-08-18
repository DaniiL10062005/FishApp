package com.fishapp.shared.preview.components.AppButton

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fishapp.shared.components.AppButton.AppButton
import com.fishapp.shared.components.AppButton.AppButtonSize
import com.fishapp.shared.components.theme.AppColors
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
            size = AppButtonSize.small,
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
            size = AppButtonSize.medium,
            radius = AppRadius.m,
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
            size = AppButtonSize.large,
            radius = AppRadius.l,
            textStyle = AppTypography.h3
        )
        AppButton(
            text = "Кастомная",
            onClick = {},
            verticalPadding = AppSpacing.custom(16.dp),
            horizontalPadding = AppSpacing.custom(16.dp),
            enabled = true,
            borderWidth = AppSpacing.border,
            borderColor = AppColors.textPrimary,
            size = AppButtonSize.custom(28.dp, 10.dp),
            radius = AppRadius.custom(16.dp),
            textStyle = AppTypography.h2
        )
    }

}