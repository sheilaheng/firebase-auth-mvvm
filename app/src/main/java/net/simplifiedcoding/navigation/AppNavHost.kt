package net.simplifiedcoding.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import net.simplifiedcoding.ui.add.AddScreen
import net.simplifiedcoding.ui.auth.AuthViewModel
import net.simplifiedcoding.ui.auth.LoginScreen
import net.simplifiedcoding.ui.auth.SignupScreen
import net.simplifiedcoding.ui.home.HomeScreen
import net.simplifiedcoding.ui.update.UpdateScreen
import net.simplifiedcoding.ui.viewcourses.viewScreen

@Composable
fun AppNavHost(
    viewModel: AuthViewModel,
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_ADD
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable(ROUTE_LOGIN) {
            LoginScreen(viewModel, navController)
        }
        composable(ROUTE_SIGNUP) {
            SignupScreen(viewModel, navController)
        }
        composable(ROUTE_HOME) {
            HomeScreen(viewModel, navController)
        }
        composable(ROUTE_ADD) {
            AddScreen(viewModel, navController)
        }
        composable(ROUTE_INSTITUTE) {
            AddScreen(viewModel, navController)
        }

        composable(ROUTE_LECTURER) {
            AddScreen(viewModel, navController)
        }

        composable(ROUTE_VIEWCOURSES) {
            viewScreen(viewModel, navController)
        }
        composable(ROUTE_UPDATE) {
            UpdateScreen(viewModel, navController)
        }

    }
}