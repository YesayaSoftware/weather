package software.yesaya.weather.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import software.yesaya.weather.data.db.entity.CURRENT_WEATHER_ID
import software.yesaya.weather.data.db.entity.CurrentWeatherEntry
import software.yesaya.weather.data.db.unitlocalized.current.ImperialCurrentWeatherEntry
import software.yesaya.weather.data.db.unitlocalized.current.MetricCurrentWeatherEntry

@Dao
interface CurrentWeatherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(weatherEntry: CurrentWeatherEntry)

    @Query("select * from current_weather where id = $CURRENT_WEATHER_ID")
    fun getWeatherMetric(): LiveData<MetricCurrentWeatherEntry>

    @Query("select * from current_weather where id = $CURRENT_WEATHER_ID")
    fun getWeatherImperial(): LiveData<ImperialCurrentWeatherEntry>
}