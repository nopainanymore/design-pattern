package com.nopainanymore.designpattern.behavior.observer;

import lombok.NoArgsConstructor;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * design-pattern: WeatherData
 *
 * @author nopainanymore
 * @version 2019-07-11 22:45
 */
@NoArgsConstructor
public class WeatherData implements Subject {

    private List<Observer> observerList = new ArrayList<>();

    private WeatherMetaData weatherMetaData;

    public void weatherChange(WeatherMetaData weatherMetaData) {
        this.weatherMetaData = weatherMetaData;
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
            observerList.forEach(observer -> observer.update(weatherMetaData));
        }
    }
}
