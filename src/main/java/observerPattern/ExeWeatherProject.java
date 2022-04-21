package observerPattern;

import observerPattern.display.CurrentConditionDisplay;
import observerPattern.display.ForecastDisplay;
import observerPattern.display.StatisticsDisplay;

public class ExeWeatherProject {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(70,35,30.4f);
        weatherData.setMeasurements(40,75,30.4f);
    }
}
