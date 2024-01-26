package components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.trendify.R.color.trendify_dark

@Composable
fun TextFiledComponent(
    modifier: Modifier = Modifier,
    textValue: String,
    onChangeTextValue: (String) -> Unit,
    label: String,
    keyboardType: KeyboardType
) {
    TextField(
        modifier = modifier
            .fillMaxWidth()
            .border(
                border = BorderStroke(2.dp, color = Color(trendify_dark)),
                shape = MaterialTheme.shapes.extraLarge
            ),
        singleLine = true,
        value = textValue,
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
        textStyle = TextStyle( color = Color(trendify_dark)),
        maxLines = 1,
        onValueChange = onChangeTextValue,
        shape = MaterialTheme.shapes.extraLarge,
        colors = TextFieldDefaults.colors(
            cursorColor = Color(trendify_dark),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
            focusedContainerColor = Color.Transparent,
            unfocusedContainerColor = Color.Transparent
        ),
        placeholder = { Text(
            text = label,
            style = MaterialTheme.typography.bodyMedium
        ) },
    )
}

@Composable
fun StatefulTextFiledComponent(
    modifier: Modifier = Modifier,
    placeholder: String,
    keyboardType: KeyboardType = KeyboardType.Text
) {
    var text by remember { mutableStateOf("") }
    TextFiledComponent(
        textValue = text,
        onChangeTextValue = { text = it },
        label = placeholder,
        keyboardType = keyboardType,
        modifier = modifier,
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TextBoxComponentPreview() {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        StatefulTextFiledComponent(placeholder = "Enter Email")
        Spacer(modifier = Modifier.padding(vertical = 8.dp))
        StatefulTextFiledComponent(placeholder = "Enter Password")
        Spacer(modifier = Modifier.padding(vertical = 8.dp))
        StatelessButtonComponent()
    }
}