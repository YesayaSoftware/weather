package software.yesaya.weather.ui.weather.future.detail

import org.threeten.bp.LocalDate
import software.yesaya.weather.data.provider.UnitProvider
import software.yesaya.weather.data.repository.ForecastRepository
import software.yesaya.weather.internal.lazyDeferred
import software.yesaya.weather.ui.base.WeatherViewModel

class FutureDetailWeatherViewModel(
    private val detailDate : LocalDate,
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {
    val weather by lazyDeferred {
        forecastRepository.getFutureWeatherByDate(detailDate, super.isMetricUnit)
    }
}
