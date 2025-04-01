package com.example.studyingcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun testingSurface(){
    Column (modifier = Modifier.background(Color.Blue)){
        Surface(
            color = Color.LightGray, // Cor de fundo
            shape = RoundedCornerShape(12.dp), // Bordas arredondadas
            shadowElevation = 4.dp,// Elevação para sombra
            modifier = Modifier.size(300.dp, 50.dp)
        ) {
            Text(
                text = "Sou um Surface!",
                modifier = Modifier.padding(16.dp)
            )
        }
        Spacer(modifier = Modifier.padding(12.dp))

        Surface (
            color = Color.Gray,
            shape = RoundedCornerShape(12.dp),
            shadowElevation = 12.dp,
            modifier = Modifier.size(300.dp, 50.dp)
        ){
            Text(
                text = "Sou o segundo Surface!",
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}

@Preview
@Composable
fun previewTesting(){
    testingSurface()
}
