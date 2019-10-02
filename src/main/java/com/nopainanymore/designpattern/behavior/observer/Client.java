package com.nopainanymore.designpattern.behavior.observer;

/**
 * design-pattern: Client
 *
 * @author nopainanymore
 * @version 2019-07-11 22:54
 */
public class Client {

    public static void main(String[] args) {
        RadioObserver radioObserver = new RadioObserver();
        TVObserver tvObserver = new TVObserver();
        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(radioObserver);
        weatherData.registerObserver(tvObserver);

        weatherData.weatherChange(new WeatherMetaData(0F, 0F, 0F));
        weatherData.weatherChange(new WeatherMetaData(1F, 1F, 1F));
    }
}
