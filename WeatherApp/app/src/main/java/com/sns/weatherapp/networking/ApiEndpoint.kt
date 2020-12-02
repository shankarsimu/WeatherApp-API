package com.sns.weatherapp.networking

/**
 * Created by Azhar Rivaldi on 03-10-2020
 */

object ApiEndpoint {
    var BASEURL = "http://api.openweathermap.org/data/2.5/"
    var CurrentWeather = "weather?"
    var ListWeather = "forecast?"
    var Daily = "forecast/daily?"
    var UnitsAppid = "&units=metric&appid=5fa38367f0a950bbb5b6c02dfa33f0c6"
    var UnitsAppidDaily = "&units=metric&cnt=15&appid=5fa38367f0a950bbb5b6c02dfa33f0c6"
}
