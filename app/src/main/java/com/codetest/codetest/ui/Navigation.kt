package com.codetest.codetest.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.codetest.core_ui.NavigationItem
import com.codetest.current_weather.view.CurrentWeatherScreen
import com.codetest.forecasting.view.ForecastingScreen

@Composable
fun Navigation (navController: NavHostController) {
    NavHost(navController = navController, startDestination = NavigationItem.CurrentWeather.route){
        composable(NavigationItem.CurrentWeather.route){
            CurrentWeatherScreen(navController)
        }

        composable(NavigationItem.Forecasting.route){
            ForecastingScreen(navController)
        }

    }
}