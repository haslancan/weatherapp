package com.example.weatherapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import android.telecom.Call as Call1

interface ApiInterFace {
    @GET ("weather")
    fun GetWeatherData(
        @Query("q") city: String,
        @Query("appid") appid:String,
        @Query("units") units:String

    ): Call<WeatherApp>
}