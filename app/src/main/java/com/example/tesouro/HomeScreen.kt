package com.example.tesouro


import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Bem-vindo à Caça ao Tesouro!")
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { navController.navigate("pista1") }) {
            Text(text = "Iniciar Caça ao Tesouro")
        }
    }
}
