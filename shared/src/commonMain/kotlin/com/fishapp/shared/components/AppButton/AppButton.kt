package com.fishapp.shared.components.AppButton

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.fishapp.shared.components.theme.AppColors
import com.fishapp.shared.components.theme.AppContainerPaddingSize
import com.fishapp.shared.components.theme.AppRadius
import com.fishapp.shared.components.theme.AppSpacing
import com.fishapp.shared.components.theme.AppTypography

@Composable
fun AppButton (
    text: String?,
    textStyle: AppTypography = AppTypography.p,
    padding: AppContainerPaddingSize = AppContainerPaddingSize.medium,
    color: AppColors = AppColors.primary,
    pressColor: AppColors = AppColors.secondary,
    radius: AppRadius = AppRadius.xl,
    onClick: () -> Unit,
    verticalPadding: AppSpacing?,
    horizontalPadding: AppSpacing?,
    enabled: Boolean,
    borderWidth: AppSpacing?,
    borderColor: AppColors?,
    modifier: Modifier = Modifier
    ){
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()

    Button(
        onClick = onClick,
        modifier = modifier
            .padding(
                horizontalPadding?.getSpacing() ?: AppSpacing.s.getSpacing(),
                verticalPadding?.getSpacing() ?: AppSpacing.s.getSpacing()
            ),
        shape = radius.getRadius(),
        colors = ButtonDefaults.buttonColors(
            containerColor = if(isPressed)pressColor.getColor() else color.getColor(),
            contentColor = AppColors.surface.getColor(),
        ),
        enabled = enabled,
        border = BorderStroke(
            borderWidth?.getSpacing() ?: AppSpacing.none.getSpacing(),
            borderColor?.getColor() ?: color.getColor()),
        contentPadding = PaddingValues(
            horizontal = padding.getHorizontal().getSpacing(),
            vertical = padding.getVertical().getSpacing()
        ),
        interactionSource = interactionSource,
        content = {
            if (text != null) {
                Text(
                    text,
                    fontSize = textStyle.getTypographySize(),
                    fontWeight= textStyle.getTypographyWeight()
                )
            }
        }
    )
}