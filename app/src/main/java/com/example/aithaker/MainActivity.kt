package com.example.aithaker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.example.aithaker.ui.navigation.AppNavGraph
import com.example.aithaker.ui.theme.AiThakerTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AiThakerTheme {
                val navController = rememberNavController()
                AppNavGraph(navController = navController)
            }
        }
    }
}