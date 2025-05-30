package com.micahnyabuto.streamflix.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LiveTv
import androidx.compose.material.icons.filled.Movie
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

enum class BottomNavigation(
    val label: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val route: Any
) {
    Home(
        label = "Home",
        selectedIcon = Icons.Default.Home,
        unselectedIcon = Icons.Default.Home,
        route = Destinations.Home
    ),

    Movies(
        label = "Movies",
        selectedIcon = Icons.Default.Movie,
        unselectedIcon = Icons.Default.Movie,
        route = Destinations.Movies
    ),
    TvSeries(
        label = "Tv Series",
        selectedIcon = Icons.Default.LiveTv,
        unselectedIcon = Icons.Default.LiveTv,
        route = Destinations.TvSeries
    ),
    WatchList(
        label = "WatchList",
        selectedIcon = Icons.Default.Bookmark,
        unselectedIcon = Icons.Default.Bookmark,
        route = Destinations.WatchList
    ),
    Profile(
        label = "Me",
        selectedIcon = Icons.Default.Person,
        unselectedIcon = Icons.Default.Person,
        route = Destinations.Profile
    )
}