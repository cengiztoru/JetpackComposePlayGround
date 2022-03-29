package com.cengiztoru.letslearncompose.ui

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.cengiztoru.letslearncompose.data.model.Message
import com.cengiztoru.letslearncompose.utils.SampleData

class ConversationViewModel : ViewModel() {

    var messages = mutableStateOf(SampleData.getMockChatList())
        private set

    fun itemExpandStateChanged(changedItem: Message) {
        val currentList = messages.value.toMutableList()
        currentList.forEachIndexed { index, item ->
            item.takeIf { changedItem == it }?.let {
                currentList[index] = changedItem.copy(isExpanded = changedItem.isExpanded.not())
            }
        }
        messages.value = currentList.toList()
    }

}