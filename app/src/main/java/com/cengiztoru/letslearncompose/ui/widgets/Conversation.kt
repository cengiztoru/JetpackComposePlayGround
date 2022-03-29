package com.cengiztoru.letslearncompose.ui.widgets

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.cengiztoru.letslearncompose.data.model.Message
import com.cengiztoru.letslearncompose.utils.SampleData


@Composable
fun Conversation(messages: List<Message>, onExpandStateChanged: (item: Message) -> Unit) {
    LazyColumn {
        items(messages) { message ->
            MessageCard(message = message, onExpandStateChanged)
        }
    }

}

@Preview
@Composable
fun ConversationPreview() {
    val mockChatList: List<Message> = SampleData.getMockChatList()
    Conversation(messages = mockChatList, {})
}


