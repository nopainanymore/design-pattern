package com.nopainanymore.designpattern.creation.builder;

/**
 * design-pattern: MercedesBenzBuilder
 *
 * @author nopainanymore
 * @version 2019-07-23 21:07
 */
public class MercedesBenzBuilder implements CarBuilder {

    private Car car;

    public MercedesBenzBuilder() {
        this.car = new Car();
    }

    @Override
    public void buildBrad() {
        this.car.setBrand("MercedesBenz");
    }

    @Override
    public void buildCarBody() {
        this.car.setCarBody(CarBody.builder().bodyColor("Black").bodySize("Large").build());
    }

    @Override
    public void buildCarHeadLight() {
        this.car.setCarHeadLight(CarHeadLight.builder().lightColor("White").lightSize("Large").build());
    }

    @Override
    public void buildCarWheel() {
        this.car.setCarWheel(CarWheel.builder().wheelSize("Large").wheelType("HighLevel").build());
    }

    @Override
    public Car buildCar() {
        return car;
    }
}
