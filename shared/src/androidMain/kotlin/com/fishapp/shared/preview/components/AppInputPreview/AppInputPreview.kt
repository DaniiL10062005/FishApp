package com.fishapp.shared.preview.components.AppInputPreview

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.fishapp.shared.components.AppInput.AppInput
import com.fishapp.shared.components.theme.AppColors
import com.fishapp.shared.components.theme.AppRadius
import com.fishapp.shared.components.theme.AppSpacing
import com.fishapp.shared.components.theme.AppTypography

@Preview(showBackground = false)
@Composable
fun AppInputPreview(){
    Column {
        AppInput(
            textStyle = AppTypography.p,
            radius = AppRadius.o,
            placeholder = "Поиск",
            label = "Поисковая строка",
            verticalPadding = AppSpacing.s,
            horizontalPadding = AppSpacing.s,
            borderWidth = AppSpacing.xs,
            borderColor = AppColors.surface
        )
    }
}