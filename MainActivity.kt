package com.example.sunnywalker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sunnywalker.ui.theme.SunnyWalkerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SunnyWalkerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    WalkerApp()
                }
            }
        }
    }
}

@Composable
fun WalkerApp() {
    var steps by remember { mutableStateOf(0) }
    var distance by remember { mutableStateOf(0.0) }
    var calories by remember { mutableStateOf(0.0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Sunny Walker", fontSize = 32.sp, style = MaterialTheme.typography.h4)
        Spacer(modifier = Modifier.height(32.dp))
        Text(text = "Steps Taken: $steps", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Distance Walked: $distance km", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Calories Burned: $calories kcal", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(32.dp))
        Button(onClick = {
            steps += 100
            distance += 0.08
            calories += 5
        }) {
            Text(text = "Simulate Walk")
        }
    }
}