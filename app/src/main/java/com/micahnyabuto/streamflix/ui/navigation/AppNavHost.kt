package com.micahnyabuto.streamflix.ui.navigation

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Popup
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.micahnyabuto.streamflix.ui.screens.home.HomeScreen
import com.micahnyabuto.streamflix.ui.screens.movies.MoviesScreen
import com.micahnyabuto.streamflix.ui.screens.onboarding.OnboardingScreen
import com.micahnyabuto.streamflix.ui.screens.profile.ProfileScreen
import com.micahnyabuto.streamflix.ui.screens.series.SeriesScreen
import com.micahnyabuto.streamflix.ui.screens.splash.SplashScreen
import com.micahnyabuto.streamflix.ui.screens.watchlist.WatchListScreen

@Composable
fun AppNavHost(
    modifier: Modifier= Modifier,
    navController: NavHostController
){
    NavHost(
        modifier = Modifier,
        navController = navController,
        startDestination = Destinations.Splash
    ) {
        composable <Destinations.Splash>{
            SplashScreen(
                onSplashFinished = {
                    navController.navigate(Destinations.Onboard){
                        popUpTo (
                            Destinations.Splash
                        ){
                            inclusive =true
                        }
                    }
                }
            )
        }
        composable <Destinations.Onboard>{
            OnboardingScreen(
                navController =navController
            )
        }
        composable <Destinations.Home>{
            HomeScreen()
        }
        composable <Destinations.Movies>{
            MoviesScreen()
        }
        composable <Destinations.TvSeries>{
            SeriesScreen()
        }
        composable <Destinations.WatchList>{
            WatchListScreen()
        }
        composable <Destinations.Profile>{
            ProfileScreen()
        }
    }

}