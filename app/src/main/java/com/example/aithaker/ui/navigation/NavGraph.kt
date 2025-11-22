package com.example.aithaker.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.aithaker.ui.screens.athkar.AthkarListScreen
import com.example.aithaker.ui.screens.detail.AthkarDetailScreen
import com.example.aithaker.ui.screens.favorites.FavoritesScreen
import com.example.aithaker.ui.screens.home.HomeScreen
import com.example.aithaker.ui.screens.settings.SettingsScreen

@Composable
fun AppNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            HomeScreen(
                onNavigateToCategory = { category ->
                    navController.navigate(Screen.AthkarList.createRoute(category))
                },
                onNavigateToFavorites = {
                    navController.navigate(Screen.Favorites.route)
                },
                onNavigateToSettings = {
                    navController.navigate(Screen.Settings.route)
                },
                onAthkarClick = { athkarId ->
                    navController.navigate(Screen.AthkarDetail.createRoute(athkarId))
                }
            )
        }

        composable(
            route = Screen.AthkarList.route,
            arguments = listOf(navArgument("category") { type = NavType.StringType })
        ) { backStackEntry ->
            val category = backStackEntry.arguments?.getString("category") ?: "MORNING"
            AthkarListScreen(
                category = category,
                onAthkarClick = { athkarId ->
                    navController.navigate(Screen.AthkarDetail.createRoute(athkarId))
                },
                onBackClick = { navController.popBackStack() }
            )
        }

        composable(
            route = Screen.AthkarDetail.route,
            arguments = listOf(navArgument("athkarId") { type = NavType.StringType })
        ) { backStackEntry ->
            val athkarId = backStackEntry.arguments?.getString("athkarId") ?: ""
            AthkarDetailScreen(
                athkarId = athkarId,
                onBackClick = { navController.popBackStack() }
            )
        }

        composable(Screen.Favorites.route) {
            FavoritesScreen(
                onAthkarClick = { athkarId ->
                    navController.navigate(Screen.AthkarDetail.createRoute(athkarId))
                },
                onBackClick = { navController.popBackStack() }
            )
        }

        composable(Screen.Settings.route) {
            SettingsScreen(
                onBackClick = { navController.popBackStack() }
            )
        }
    }
}
