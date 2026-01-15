package com.example.dvbiepgtvapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.dvbiepgtvapp.ui.screens.epg.EpgScreen

@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Routes.EPG
    ) {
        composable(Routes.EPG) { EpgScreen() }
    }
}