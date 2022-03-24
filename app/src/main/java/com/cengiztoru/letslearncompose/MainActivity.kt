package com.cengiztoru.letslearncompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.cengiztoru.letslearncompose.ui.widgets.LetsLearnCompose

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LetsLearnCompose()
        }
    }
}


@Preview
@Composable
fun PreviewMessageCard() {
    LetsLearnCompose()
}
