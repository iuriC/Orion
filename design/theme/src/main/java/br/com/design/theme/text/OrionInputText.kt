package br.com.design.theme.text

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun OrionInputText(
    modifier: Modifier = Modifier,
    value: String,
    enable: Boolean = true,
    readOnly: Boolean = false,
    singleLine: Boolean = false,
    isError: Boolean = false,
    onValueChange: (String) -> Unit,
    label: String,
) {
    OutlinedTextField(
        modifier = modifier.fillMaxWidth(),
        value = value,
        onValueChange = onValueChange,
        enabled = enable,
        readOnly = readOnly,
        singleLine = singleLine,
        isError = isError,
        label = {
            Text(
                text = label,
                style = MaterialTheme.typography.labelSmall
            )
        },
        colors = orionInputTextColors()
    )
}

@Composable
fun orionInputTextColors(): TextFieldColors {
    return OutlinedTextFieldDefaults.colors()
}