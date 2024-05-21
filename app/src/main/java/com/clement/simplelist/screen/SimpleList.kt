package com.clement.simplelist.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.*
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.clement.simplelist.R
import com.clement.simplelist.components.ListItem

@Composable
fun SimpleList(viewModel: SimpleListViewModel = viewModel()) {
    val data by viewModel.data.collectAsState()

    SimpleListContent(data)
}

@Composable
fun SimpleListContent(data: List<String>) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(title = { Text(text = stringResource(R.string.simple_list)) })
        },
    ) { it ->
        LazyColumn(modifier = Modifier.padding(it)) {
            items(data.size) {
                ListItem(data[it])
            }
        }
    }
}

@Preview()
@Composable
fun SimpleListContentPreview() {
    SimpleListContent(listOf("Item 1", "Item 2", "Item 3"))
}

