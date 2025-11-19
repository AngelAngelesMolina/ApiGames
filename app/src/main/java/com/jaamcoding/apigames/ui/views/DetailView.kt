package com.jaamcoding.apigames.ui.views

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.jaamcoding.apigames.ui.viewmodel.GamesViewModel

@Composable
fun DetailView(viewModel: GamesViewModel, navController: NavController, id: Int) {
    Text(text = "Detail", color = Color.Black)
}