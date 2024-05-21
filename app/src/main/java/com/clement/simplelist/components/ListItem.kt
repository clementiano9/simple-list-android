package com.clement.simplelist.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ListItem(text: String) {
    Text(
        text = text,
        modifier = Modifier.padding(16.dp).fillMaxWidth()
    )
}

@Preview(showBackground = true)
@Composable
fun ListItemPreview() {
    ListItem("Item 1")
}