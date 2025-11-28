package com.jaamcoding.apigames.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.jaamcoding.apigames.navigation.NavManager
import com.jaamcoding.apigames.ui.theme.ApiGamesTheme
import com.jaamcoding.apigames.ui.viewmodel.GamesViewModel
import com.jaamcoding.apigames.ui.views.HomeView
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val viewModel : GamesViewModel by viewModels()
        setContent {
            ApiGamesTheme {
               /* Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HomeView(vm = viewModel)
                }*/
                NavManager(gamesVm = viewModel)
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ApiGamesTheme {
        Greeting("Android")
    }
}