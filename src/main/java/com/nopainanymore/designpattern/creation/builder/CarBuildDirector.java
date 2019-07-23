package com.nopainanymore.designpattern.creation.builder;

/**
 * design-pattern: CarBuildDirector
 *
 * @author NoPainAnymore
 * @date 2019-07-23 21:04
 */
public class CarBuildDirector {

    private CarBuilder carBuilder;

    public CarBuildDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car buildCar(){
        this.carBuilder.buildBrad();
        this.carBuilder.buildCarBody();
        this.carBuilder.buildCarHeadLight();
        this.carBuilder.buildCarWheel();
        return this.carBuilder.buildCar();
    }

}
