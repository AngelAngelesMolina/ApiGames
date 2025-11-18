package com.jaamcoding.apigames.ui.views

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.collectAsState
import com.jaamcoding.apigames.ui.viewmodel.GamesViewModel
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue

@Composable
fun HomeView(vm: GamesViewModel) {
    val games by vm.games.collectAsState()
    LazyColumn {
        items(games.count()) { game ->
            Text(text = games[game].name)
        }
    }

}