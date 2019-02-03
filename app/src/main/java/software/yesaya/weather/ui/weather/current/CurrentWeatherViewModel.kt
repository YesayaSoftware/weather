package software.yesaya.weather.ui.weather.current

import androidx.lifecycle.ViewModel;
import software.yesaya.weather.data.provider.UnitProvider
import software.yesaya.weather.data.repository.ForecastRepository
import software.yesaya.weather.internal.UnitSystem
import software.yesaya.weather.internal.lazyDeferred
import software.yesaya.weather.ui.base.WeatherViewModel

class CurrentWeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(super.isMetricUnit)
    }
}
