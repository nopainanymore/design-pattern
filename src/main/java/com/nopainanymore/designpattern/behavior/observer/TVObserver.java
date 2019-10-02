package com.nopainanymore.designpattern.behavior.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: TVObserver
 *
 * @author nopainanymore
 * @version 2019-07-11 22:52
 */
@Slf4j
public class TVObserver implements Observer {

    @Override
    public void update(WeatherMetaData weatherMetaData) {
        log.info("TVObserver- now weather - temperature:{},  humidity:{} , pressure:{}", weatherMetaData.getTemperature(), weatherMetaData.getHumidity(), weatherMetaData.getPressure());
    }
}
