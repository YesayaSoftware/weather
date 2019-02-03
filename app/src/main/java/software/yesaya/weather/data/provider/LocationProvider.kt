package software.yesaya.weather.data.provider

import software.yesaya.weather.data.db.entity.WeatherLocation

interface LocationProvider {
    suspend fun hasLocationChanged(lastWeatherLocation: WeatherLocation): Boolean
    suspend fun getPreferredLocationString(): String
}