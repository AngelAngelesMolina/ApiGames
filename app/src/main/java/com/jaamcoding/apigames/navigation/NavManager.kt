package com.jaamcoding.apigames.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jaamcoding.apigames.ui.viewmodel.GamesViewModel
import com.jaamcoding.apigames.ui.views.DetailView
import com.jaamcoding.apigames.ui.views.HomeView

@Composable
fun NavManager(gamesVm : GamesViewModel) {

    val navController = rememberNavController()
    NavHost(navController, startDestination ="Home"){
        composable("Home"){
            HomeView(gamesVm, navController)
        }
        composable("DetailView"){
            DetailView(gamesVm, navController)
        }

    }

}