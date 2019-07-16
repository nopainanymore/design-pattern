package com.nopainanymore.designpattern.behavior.observer;

import lombok.NoArgsConstructor;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * design-pattern: WeatherData
 *
 * @author NoPainAnymore
 * @date 2019-07-11 22:45
 */
@NoArgsConstructor
public class WeatherData implements Subject {

    private List<Observer> observerList = new ArrayList<>();

    private float temperature;

    private float humidity;

    private float pressure;

    public void weatherChange(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        if (!CollectionUtils.isEmpty(observerList)) {
            observerList.forEach(observer -> observer.update(temperature, humidity, pressure));
        }
    }
}
