package software.yesaya.weather.data.network

import androidx.lifecycle.LiveData
import software.yesaya.weather.data.network.response.CurrentWeatherResponse
import software.yesaya.weather.data.network.response.FutureWeatherResponse

interface WeatherNetworkDataSource {
    val downloadedCurrentWeather: LiveData<CurrentWeatherResponse>
    val downloadedFutureWeather: LiveData<FutureWeatherResponse>

    suspend fun fetchCurrentWeather(
        location: String,
        languageCode: String
    )
    suspend fun fetchFutureWeather(
        location: String,
        languageCode: String
    )
}