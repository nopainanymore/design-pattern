package com.nopainanymore.designpattern.creation.builder;

import lombok.Data;

/**
 * design-pattern: Car
 *
 * @author nopainanymore
 * @version 2019-07-23 20:53
 */
@Data
public class Car {

    private String brand;

    private CarBody carBody;

    private CarHeadLight carHeadLight;

    private CarWheel carWheel;

}
