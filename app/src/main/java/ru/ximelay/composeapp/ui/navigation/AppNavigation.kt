package ru.ximelay.composeapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ru.ximelay.composeapp.ui.screens.auth.AuthScreen
import ru.ximelay.composeapp.ui.screens.login.LoginScreen

@Composable
fun AppNavigation(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = NavigationRoutes.Auth,
        modifier = Modifier
    ) {
        composable<NavigationRoutes.Auth> {
            AuthScreen(
                onNavigateToLogin = {
                    navController.navigate(NavigationRoutes.Login)
                },
                onNavigateToSignUp = {
                    navController.navigate(NavigationRoutes.SignUp)
                },
                onNavigateToPreview = {
//                    navController.navigate(NavigationRoutes.)
                }
            )
        }

        composable<NavigationRoutes.Login> {
            LoginScreen(
                onNavigateBack = {
                    navController.navigateUp()
                },
                onLoginSuccess = {
                    // sss
                }
            )
        }

        composable<NavigationRoutes.SignUp> {
            //
        }
    }
}