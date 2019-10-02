package com.nopainanymore.designpattern.behavior.observer;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * design-pattern: WeatherMetaData
 *
 * @author nopainanymore
 * @version 2019-10-02 10:03
 */
@Data
@AllArgsConstructor
class WeatherMetaData {

    private Float temperature;

    private Float humidity;

    private Float pressure;

}
