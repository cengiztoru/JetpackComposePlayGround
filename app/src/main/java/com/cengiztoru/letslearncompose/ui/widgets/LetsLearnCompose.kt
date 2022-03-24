package com.cengiztoru.letslearncompose.ui.widgets

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.cengiztoru.letslearncompose.data.model.Message
import com.cengiztoru.letslearncompose.ui.theme.LetsLearnComposeTheme

@Composable
fun LetsLearnCompose() {
    LetsLearnComposeTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
            val message = Message("MainAct", "LetsLearnCompose")
            MessageCard(message)
        }
    }

}

@Preview
@Composable
fun LetsLearnComposePreview() {
    val message = Message("MainAct", "LetsLearnCompose")
    MessageCard(message)
}
