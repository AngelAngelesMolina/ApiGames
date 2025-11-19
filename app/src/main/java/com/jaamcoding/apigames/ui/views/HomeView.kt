package com.jaamcoding.apigames.ui.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.collectAsState
import com.jaamcoding.apigames.ui.viewmodel.GamesViewModel
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.jaamcoding.apigames.ui.components.CardGame
import com.jaamcoding.apigames.ui.components.MainTopBar
import com.jaamcoding.apigames.ui.theme.CustomBlack

@Composable
fun HomeView(
    vm: GamesViewModel,
    navControler: NavController
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
    LazyColumn(
        modifier = Modifier
            .padding(pad)
            .background(CustomBlack)
    ) {
        items(games) { game ->
            CardGame(game, {})
            Text(
                text = game.name, fontWeight = FontWeight.ExtraBold,
                color = Color.White,
                modifier = Modifier.padding(start = 10.dp)
            )
        }
    }
}