package com.sergiocuadros.ecommerceaplicacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationApp(onClickRegister: () -> Unit = {}) {
    val navController = rememberNavController()
    val startDestination: String = "login"

    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable("login") {
            LoginScreen(onClickRegister = {
                navController.navigate("register")
            })
        }
        composable("register") {
            RegisterScreen(onClickBack = {
                navController.popBackStack()
            })
        }
    }
}