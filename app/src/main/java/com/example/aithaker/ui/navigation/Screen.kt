package com.example.aithaker.ui.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    
    object AthkarList : Screen("athkar_list/{category}") {
        fun createRoute(category: String) = "athkar_list/$category"
    }
    
    object AthkarDetail : Screen("athkar_detail/{athkarId}") {
        fun createRoute(athkarId: String) = "athkar_detail/$athkarId"
    }
    
    object Favorites : Screen("favorites")
    
    object Settings : Screen("settings")
}
