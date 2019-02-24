package software.yesaya.weather.data.repository

import androidx.lifecycle.LiveData
import software.yesaya.weather.data.db.entity.WeatherLocation
import software.yesaya.weather.data.db.unitlocalized.current.UnitSpecificCurrentWeatherEntry
import software.yesaya.weather.data.db.unitlocalized.future.list.UnitSpecificSimpleFutureWeatherEntry
import org.threeten.bp.LocalDate
import software.yesaya.weather.data.db.unitlocalized.future.detail.UnitSpecificDetailFutureWeatherEntry

interface ForecastRepository {
    suspend fun getCurrentWeather(metric: Boolean): LiveData<out UnitSpecificCurrentWeatherEntry>

    suspend fun getFutureWeatherList(startDate: LocalDate, metric: Boolean): LiveData<out List<UnitSpecificSimpleFutureWeatherEntry>>

    suspend fun getFutureWeatherByDate(date: LocalDate, metric: Boolean) : LiveData<out UnitSpecificDetailFutureWeatherEntry>

    suspend fun getWeatherLocation(): LiveData<WeatherLocation>
}