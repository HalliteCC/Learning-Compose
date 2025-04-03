package com.example.studyingcompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun myApp(
    modifier: Modifier = Modifier,
    names: List<String> = listOf("World", "Compose")
) {
    Column(
        modifier = Modifier.padding(vertical = 4.dp)
    ) {
        for (name in names) {
            greeting(name = name)
        }
    }
}

@Composable
fun greeting(name: String, modifier: Modifier = Modifier) {

    var expanded by remember { mutableStateOf(false) }
    val extraPadding = if (expanded) 48.dp else 0.dp

    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Row(modifier = Modifier.padding(24.dp)) {
            Column(
                modifier = Modifier.weight(1f).padding(bottom = extraPadding)) {
                Text("Hello")
                Text(name)
            }
            ElevatedButton(onClick = { expanded = !expanded }) {
                Text(if (expanded) "Show Less" else "Show More")
            }
        }
    }

}


@Preview
@Composable
fun preview() {
    myApp()
}