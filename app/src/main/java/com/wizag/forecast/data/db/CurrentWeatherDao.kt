package com.wizag.forecast.data.db

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.wizag.forecast.data.db.entity.CURRENT_WEATHER_ID
import com.wizag.forecast.data.db.entity.CurrentWeatherEntry
import com.wizag.forecast.data.db.unitlocalized.ImperialCurrentWeatherEntry
import com.wizag.forecast.data.db.unitlocalized.MetricCurrentWeatherEntry
import com.wizag.forecast.data.db.unitlocalized.UnitSpecificCurrentWeatherEntry


interface CurrentWeatherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(weatherEntry: CurrentWeatherEntry)

    @Query("select * from current_weather where id = $CURRENT_WEATHER_ID")
    fun getWeatherMetric(): LiveData<MetricCurrentWeatherEntry>

    @Query("select * from current_weather where id = $CURRENT_WEATHER_ID")
    fun getWeatherImperial(): LiveData<ImperialCurrentWeatherEntry>
}