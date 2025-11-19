package com.jaamcoding.apigames.ui.views

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.collectAsState
import com.jaamcoding.apigames.ui.viewmodel.GamesViewModel
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.jaamcoding.apigames.ui.components.MainTopBar

@Composable
fun HomeView(
    vm: GamesViewModel
) {
    Scaffold(
        topBar = {
            MainTopBar(title = "API GAMES")
        }
    ) { innerPadding ->
        ContentHomeView(vm = vm, pad = innerPadding)
    }


}

@Composable
fun ContentHomeView(vm: GamesViewModel, pad: PaddingValues) {
    val games by vm.games.collectAsState()
    LazyColumn(modifier = Modifier.padding(pad)) {
        items(games.count()) { game ->
            Text(text = games[game].name)
        }
    }
}