package com.uva.kmm_template.android.detail

import androidx.compose.foundation.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import org.koin.androidx.compose.koinViewModel
import com.uva.kmm_template.android.detail.DetailComponents

@Composable
fun DetailScreen(viewModel: DetailViewModel = koinViewModel()) {
    val state by viewModel.state.collectAsState()

    DetailContent(
        state = state,
        onAction = viewModel::onReceiveAction
    )
}

@Composable
fun DetailContent(
    state: DetailComponents.State,
    onAction: (DetailComponents.Action) -> Unit
) {

}