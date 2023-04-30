package com.uva.kmm_template.android.home

import com.uva.kmm_template.android.utils.ViewAction
import com.uva.kmm_template.android.utils.ViewEvent
import com.uva.kmm_template.android.utils.ViewState

object HomeComponents {

    data class State(
        val isLoading: Boolean = true,
        val items: List<String> = listOf(),
        val isError: Boolean = false
    ) : ViewState()

    class Event : ViewEvent()
    sealed class Action : ViewAction() {
        data class OnItemClick(val item: String) : Action()
    }
}
