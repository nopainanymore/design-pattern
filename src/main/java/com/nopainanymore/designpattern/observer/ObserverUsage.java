package com.nopainanymore.designpattern.observer;

/**
 * design-pattern: ObserverUsage
 *
 * @author NoPainAnymore
 * @date 2019-07-11 22:54
 */
public class ObserverUsage {

    public static void main(String[] args) {
        RadioObserver radioObserver = new RadioObserver();
        TVObserver tvObserver = new TVObserver();
        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(radioObserver);
        weatherData.registerObserver(tvObserver);

        weatherData.weatherChange(0F, 0F, 0F);
        weatherData.weatherChange(1F, 1F, 1F);
    }
}
