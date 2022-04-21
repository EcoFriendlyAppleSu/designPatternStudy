package observerPattern.display;

import observerPattern.WeatherData;
import observerPattern.observer.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this); // kind of Upcasting
    }

    @Override
    public void display() {
        System.out.println("temperature = " + temperature
                + " humidity = " + humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
