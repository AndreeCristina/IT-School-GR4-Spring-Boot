package com.itschool.project.controllers;

import com.itschool.project.models.entities.Weather;
import com.itschool.project.services.WeatherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/" +
            "")
    public ResponseEntity<Weather> getWeather(@RequestParam String city) throws IOException {
        // city name
        // Current weather description
        // last time weather information was updated

        // .../api/weather?city=London
        return ResponseEntity.ok(weatherService.getCityWeather(city));
    }
 }