package software.yesaya.weather.data.network.response

import com.google.gson.annotations.SerializedName
import software.yesaya.weather.data.db.entity.CurrentWeatherEntry
import software.yesaya.weather.data.db.entity.WeatherLocation

data class CurrentWeatherResponse(
    val location: WeatherLocation,
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry
)