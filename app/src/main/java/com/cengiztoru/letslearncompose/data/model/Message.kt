package com.cengiztoru.letslearncompose.data.model

data class Message(val author: String, val body: String, var isExpanded: Boolean = false)
