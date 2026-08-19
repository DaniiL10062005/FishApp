package com.fishapp.shared.components.AppInput

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import com.fishapp.shared.components.theme.AppColors
import com.fishapp.shared.components.theme.AppContainerPaddingSize
import com.fishapp.shared.components.theme.AppRadius
import com.fishapp.shared.components.theme.AppSpacing
import com.fishapp.shared.components.theme.AppTypography

@Composable
fun AppInput(
    text: String? = null,
    onValueChange: (String)->Unit = {},
    textStyle: AppTypography = AppTypography.p,
    padding: AppContainerPaddingSize = AppContainerPaddingSize.medium,
    color: AppColors = AppColors.primary,
    radius: AppRadius = AppRadius.o,
    verticalPadding: AppSpacing?,
    horizontalPadding: AppSpacing?,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    isError: Boolean = false,
    borderWidth: AppSpacing?,
    borderColor: AppColors?,
    placeholder: String?,
    label: String?,
    modifier: Modifier = Modifier,
    minLines: Int = 1,
    maxLines: Int = 1
){
    val interactionSource = remember { MutableInteractionSource() }

    var currentText by remember { mutableStateOf(text ?:"") }

    OutlinedTextField(
        value = currentText,
        onValueChange = { it: String ->
            currentText = it
            onValueChange(it)
        },
        minLines = minLines,
        maxLines = maxLines,
        modifier = modifier,
        enabled = enabled,
        readOnly = readOnly,
        textStyle = TextStyle(
            fontSize = textStyle.getTypographySize(),
            fontWeight = textStyle.getTypographyWeight()
        ),
        label = label?.let{
            @Composable{
                Text(
                    text = it,
                    fontSize = AppTypography.p.getTypographySize(),
                    fontWeight = AppTypography.p.getTypographyWeight()
                )
            }
        },
        placeholder = placeholder?.let {
            @Composable {
                Text(
                    text = it,
                    fontSize = AppTypography.p.getTypographySize(),
                    fontWeight = AppTypography.p.getTypographyWeight()
                )
            }
        },
        isError = isError,
        shape = radius.getRadius(),
        interactionSource = interactionSource,
    )
}