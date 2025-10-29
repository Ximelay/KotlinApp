package ru.ximelay.composeapp.ui.navigation

import kotlinx.serialization.Serializable

sealed interface NavigationRoutes {

    @Serializable
    data object Auth : NavigationRoutes

    @Serializable
    data object Login : NavigationRoutes

    @Serializable
    data object SignUp : NavigationRoutes

    //TODO провиль в будущем
    @Serializable
    data class Profile(val userId: String) : NavigationRoutes
}