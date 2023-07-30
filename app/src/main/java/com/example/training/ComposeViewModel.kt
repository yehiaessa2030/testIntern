package com.example.training

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class ComposeViewModel : ViewModel() {
    private val _checked = mutableStateOf(true)
    val checked: State<Boolean> = _checked

    fun changeCheckedState(check: Boolean) {
        _checked.value = check
    }
}