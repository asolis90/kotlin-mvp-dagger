package com.asolis.kotlinmvpdagger.models

data class CurrentWeather(
    val coord: Coordinates,
    val weather: Weather,
    val main: Main,
    val icon: String
)

data class Weather(
    val id: String,
    val main: String,
    val description: String,
    val icon: String
)

data class Coordinates(
    val lon: String,
    val lat: String
)

data class Main(
    val temp: String,
    val pressure: String,
    val humidity: String,
    val temp_min: String,
    val temp_max: String
)