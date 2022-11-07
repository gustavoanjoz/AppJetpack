package com.example.aulateste

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

//Renderização do Aplicativo
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard("Android")
        }
    }
}

//Criação da função Composta
@Composable
fun MessageCard(name: String) {
    Text(text = "Hello $name!")
}

  