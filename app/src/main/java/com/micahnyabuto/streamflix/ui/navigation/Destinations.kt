package com.micahnyabuto.streamflix.ui.navigation

import kotlinx.serialization.Serializable

sealed class Destinations {
    @Serializable
    object Splash

    @Serializable
    object Onboard

    @Serializable
    object Home

    @Serializable
    object Movies

    @Serializable
    object TvSeries

    @Serializable
    object WatchList

    @Serializable
    object Profile

}