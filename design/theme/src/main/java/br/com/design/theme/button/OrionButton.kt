package br.com.design.theme.button

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import br.com.design.theme.OrionTheme
import br.com.design.theme.button.holder.OrionButtonHolder
import br.com.design.theme.button.type.ButtonStyle
import br.com.design.theme.button.type.ButtonType
import br.com.design.theme.preview.OrionPreview

@Composable
fun OrionButton(
    modifier: Modifier = Modifier,
    type: ButtonType = ButtonType.PRIMARY,
    style: ButtonStyle = ButtonStyle.FILLED,
    leadingIcon: ImageVector? = null,
    trailingIcon: ImageVector? = null,
    enabled: Boolean = true,
    text: String,
    onClick: () -> Unit,
) {
    OrionButtonHolder.Init(type, style)

    val colors = OrionButtonHolder.buttonColors()
    val elevation = OrionButtonHolder.buttonElevation()
    val border = OrionButtonHolder.buttonBorder()
    val shape = OrionButtonHolder.buttonShape()

    Button(
        modifier = modifier.fillMaxWidth(),
        onClick = onClick,
        enabled = enabled,
        colors = colors,
        border = border,
        shape = shape,
        elevation = elevation
    ) {
        OrionButtonContent(
            text = text,
            leadingIcon = leadingIcon,
            trailingIcon = trailingIcon
        )
    }
}

@Composable
private fun OrionButtonContent(
    modifier: Modifier = Modifier,
    leadingIcon: ImageVector? = null,
    trailingIcon: ImageVector? = null,
    text: String,
) {
    leadingIcon?.let {
        Icon(imageVector = it, contentDescription = it.name)

        Spacer(modifier = modifier.width(OrionTheme.spacing.spacingSmall))
    }

    Text(text = text)

    trailingIcon?.let {
        Spacer(modifier = modifier.width(OrionTheme.spacing.spacingSmall))

        Icon(imageVector = it, contentDescription = it.name)
    }
}

@Composable
@OrionPreview
private fun OrionPrimaryFilledButtonPreview() {
    OrionTheme {
        OrionButton(
            text = "Primary Filled Button",
            type = ButtonType.PRIMARY,
            style = ButtonStyle.FILLED,
            leadingIcon = Icons.Filled.Add,
        ) {}
    }
}

@Composable
@OrionPreview
private fun OrionPrimaryOutlineButtonPreview() {
    OrionTheme {
        OrionButton(
            text = "Primary Outlined Button",
            type = ButtonType.PRIMARY,
            style = ButtonStyle.OUTLINED,
            leadingIcon = Icons.Filled.Add
        ) {}
    }
}

@Composable
@OrionPreview
private fun OrionPrimaryTextButtonPreview() {
    OrionTheme {
        OrionButton(
            text = "Primary Text Button",
            type = ButtonType.PRIMARY,
            style = ButtonStyle.TEXT,
            leadingIcon = Icons.Filled.Add
        ) {}
    }
}

@Composable
@OrionPreview
private fun OrionSecondaryFilledButtonPreview() {
    OrionTheme {
        OrionButton(
            text = "Primary Filled Button",
            type = ButtonType.SECONDARY,
            style = ButtonStyle.FILLED,
            trailingIcon = Icons.Filled.Done
        ) {}
    }
}

@Composable
@OrionPreview
private fun OrionSecondaryOutlineButtonPreview() {
    OrionTheme {
        OrionButton(
            text = "Primary Outlined Button",
            type = ButtonType.SECONDARY,
            style = ButtonStyle.OUTLINED,
            trailingIcon = Icons.Filled.Done
        ) {}
    }
}

@Composable
@OrionPreview
private fun OrionSecondaryTextButtonPreview() {
    OrionTheme {
        OrionButton(
            text = "Primary Text Button",
            type = ButtonType.SECONDARY,
            style = ButtonStyle.TEXT,
            trailingIcon = Icons.Filled.Done
        ) {}
    }
}

@Composable
@OrionPreview
private fun OrionTertiaryFilledButtonPreview() {
    OrionTheme {
        OrionButton(
            text = "Primary Filled Button",
            type = ButtonType.TERTIARY,
            style = ButtonStyle.FILLED,
            leadingIcon = Icons.Filled.Create
        ) {}
    }
}

@Composable
@OrionPreview
private fun OrionTertiaryOutlineButtonPreview() {
    OrionTheme {
        OrionButton(
            text = "Primary Outlined Button",
            type = ButtonType.TERTIARY,
            style = ButtonStyle.OUTLINED,
            leadingIcon = Icons.Filled.Create
        ) {}
    }
}

@Composable
@OrionPreview
private fun OrionTertiaryTextButtonPreview() {
    OrionTheme {
        OrionButton(
            text = "Primary Text Button",
            type = ButtonType.TERTIARY,
            style = ButtonStyle.TEXT,
            leadingIcon = Icons.Filled.Create
        ) {}
    }
}
