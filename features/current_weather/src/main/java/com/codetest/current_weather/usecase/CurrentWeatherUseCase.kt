package com.codetest.current_weather.usecase

import com.codetest.data.model.CurrentWeather
import com.codetest.data.repository.CurrentWeatherRepository
import javax.inject.Inject

class CurrentWeatherUseCase @Inject constructor(private val repositories : CurrentWeatherRepository) {
    suspend fun getCurrentWeather() : Result<CurrentWeather> = repositories.getCurrentWeather()

}