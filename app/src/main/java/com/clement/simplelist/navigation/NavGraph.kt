package com.clement.simplelist.navigation

import androidx.compose.material.ScaffoldState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.clement.simplelist.screen.SimpleList

@Composable
fun NavGraph(
    navController: NavHostController = rememberNavController(),
    scaffoldState: ScaffoldState = rememberScaffoldState(),
    startDestination: String = Screen.MainScreen
) {
    NavHost(navController = navController, startDestination = startDestination) {
        composable(Screen.MainScreen) {
            SimpleList()
        }
    }
}