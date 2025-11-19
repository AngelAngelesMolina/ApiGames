package com.jaamcoding.apigames.ui.views

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.collectAsState
import com.jaamcoding.apigames.ui.viewmodel.GamesViewModel
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier

@Composable
fun HomeView(
    vm: GamesViewModel, modifier: Modifier
) {
    val games by vm.games.collectAsState()
    LazyColumn(modifier = modifier) {
        items(games.count()) { game ->
            Text(text = games[game].name)
        }
    }

}