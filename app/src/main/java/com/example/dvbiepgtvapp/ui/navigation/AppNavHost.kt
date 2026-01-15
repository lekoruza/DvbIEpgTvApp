package com.example.dvbiepgtvapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.dvbiepgtvapp.ui.screens.epg.EpgScreen
import com.example.dvbiepgtvapp.ui.screens.home.HomeScreen

@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Routes.HOME
    ) {
        composable(Routes.HOME) {
            HomeScreen( onOpenEpg = { navController.navigate(Routes.EPG) })
        }
        composable(Routes.EPG) { EpgScreen() }
    }
}