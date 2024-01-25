package components

import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TextBoxComponent(
    modifier: Modifier = Modifier,
    textValue: String,
    onChangeTextValue: (String) -> Unit
) {
    TextField(
        modifier = modifier,
        value = textValue,
        onValueChange = onChangeTextValue
    )
}

@Preview
@Composable
fun TextBoxComponentPreview() {
    TextBoxComponent(
        textValue = "Name",
        onChangeTextValue = {}
    )
}