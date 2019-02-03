package software.yesaya.weather.data.network.response

import com.google.gson.annotations.SerializedName
import software.yesaya.weather.data.db.entity.FutureWeatherEntry

data class ForecastDaysContainer(
    @SerializedName("forecastday")
    val entries: List<FutureWeatherEntry>
)