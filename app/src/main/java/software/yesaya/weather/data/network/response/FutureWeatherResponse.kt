package software.yesaya.weather.data.network.response

import com.google.gson.annotations.SerializedName
import software.yesaya.weather.data.db.entity.WeatherLocation

data class FutureWeatherResponse(
    @SerializedName("forecast")
    val futureWeatherEntries: ForecastDaysContainer,
    val location: WeatherLocation
)