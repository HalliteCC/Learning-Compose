package com.example.studyingcompose

import com.example.studyingcompose.ui.theme.Purple40
import com.example.studyingcompose.ui.theme.StudyingComposeTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun clickMe() {
    var count by remember { mutableStateOf(0) }
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(8.dp).fillMaxSize()
    ){
        Text(text = count.toString())
        Button(
            onClick = { count++ },
            colors = ButtonDefaults.buttonColors(
                containerColor = Purple40
            ),
            shape = CutCornerShape(50.dp)
        ){
            Text(text = "Click Me: $count")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    StudyingComposeTheme {
        clickMe()
    }
}