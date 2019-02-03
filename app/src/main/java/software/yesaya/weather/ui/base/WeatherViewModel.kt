package software.yesaya.weather.ui.base

import androidx.lifecycle.ViewModel
import software.yesaya.weather.data.provider.UnitProvider
import software.yesaya.weather.data.repository.ForecastRepository
import software.yesaya.weather.internal.UnitSystem
import software.yesaya.weather.internal.lazyDeferred

abstract class WeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : ViewModel() {

    private val unitSystem = unitProvider.getUnitSystem()

    val isMetricUnit: Boolean
        get() = unitSystem == UnitSystem.METRIC

    val weatherLocation by lazyDeferred {
        forecastRepository.getWeatherLocation()
    }
}