package com.jaamcoding.apigames.ui.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.jaamcoding.apigames.ui.components.MainImage
import com.jaamcoding.apigames.ui.components.MainTopBar
import com.jaamcoding.apigames.ui.theme.CustomBlack
import com.jaamcoding.apigames.ui.viewmodel.GamesViewModel

@Composable
fun DetailView(viewModel: GamesViewModel, navController: NavController, id: Int) {

    LaunchedEffect(Unit) {
        viewModel.getGameById(id)
    }

    Scaffold(topBar = {
        MainTopBar(
            title = viewModel.state.name,
            showBackButton = true,
            onClickBackButton = { navController.popBackStack() })
    }) { paddingValues ->
        ContentDetailView(paddingValues, viewModel)
    }
}

@Composable
fun ContentDetailView(pad: PaddingValues, viewModel: GamesViewModel) {
    val state = viewModel.state
    Column(
        modifier = Modifier
            .padding(pad)
            .background(CustomBlack)
    ) {
        MainImage(img = state.background_image)
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 5.dp)
        ) {
            Text(text = viewModel.state.name, color = Color.Black)
        }
    }

}