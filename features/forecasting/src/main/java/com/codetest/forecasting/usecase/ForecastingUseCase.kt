package com.codetest.forecasting.usecase

import com.codetest.data.repository.CurrentWeatherRepository
import javax.inject.Inject

class ForecastingUseCase @Inject constructor(private val repository : CurrentWeatherRepository) {

    suspend fun getForecastingDays() = repository.getForecasting("10")

}