package com.cengiztoru.letslearncompose.ui.widgets

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.cengiztoru.letslearncompose.ui.ConversationViewModel
import com.cengiztoru.letslearncompose.ui.theme.LetsLearnComposeTheme
import com.cengiztoru.letslearncompose.utils.SampleData

@Composable
fun LetsLearnCompose(conversationViewModel: ConversationViewModel = viewModel()) {
    LetsLearnComposeTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
            Conversation(messages = conversationViewModel.messages.value) {
                conversationViewModel.onMessageExpandStateChange(it)
            }
        }
    }

}

@Preview(name = "Light Mode", showBackground = true)

@Composable
fun LetsLearnComposePreview() {
    Conversation(messages = SampleData.getMockChatList()) {

    }
}
