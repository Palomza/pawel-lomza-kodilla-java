package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public Double calculateAverageTemperature() {
       Map<String, Double> resultMap = temperatures.getTemperatures();
       Double sum = 0.0;
       for(Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
           sum = sum + temperature.getValue();
       }
       return sum / resultMap.size();
    }

    public Double calculateMedianTemperature() {
        List<Double> temperatureList = new ArrayList<>(temperatures.getTemperatures().values());
        Collections.sort(temperatureList);
        if (temperatureList.size() % 2 == 0) {
            return (temperatureList.get(temperatureList.size() / 2 - 1) + temperatureList.get(temperatureList.size() / 2)) / 2.0;
        } else {
            return temperatureList.get(temperatureList.size() / 2);
        }
    }

}