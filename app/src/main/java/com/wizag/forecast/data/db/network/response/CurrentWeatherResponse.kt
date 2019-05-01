package com.wizag.forecast.data.db.network.response


import com.google.gson.annotations.SerializedName
import com.wizag.forecast.data.db.entity.CurrentWeatherEntry
import com.wizag.forecast.data.db.entity.Location

data class CurrentWeatherResponse(
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry,
    @SerializedName("location")
    val location: Location
)