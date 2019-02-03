package software.yesaya.weather.ui.weather.future.list

import androidx.lifecycle.ViewModel;
import software.yesaya.weather.data.provider.UnitProvider
import software.yesaya.weather.data.repository.ForecastRepository
import software.yesaya.weather.internal.lazyDeferred
import software.yesaya.weather.ui.base.WeatherViewModel
import org.threeten.bp.LocalDate

class FutureListWeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {

    val weatherEntries by lazyDeferred {
        forecastRepository.getFutureWeatherList(LocalDate.now(), super.isMetricUnit)
    }
}
