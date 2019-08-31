package com.nopainanymore.designpattern.creation.builder;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: Client
 *
 * @author nopainanymore
 * @version 2019-07-23 21:16
 */
@Slf4j
public class Client {

    private static Gson gson = new Gson();

    public static void main(String[] args) {
        CarBuilder carBuilder = new MercedesBenzBuilder();
        CarBuildDirector director = new CarBuildDirector(carBuilder);
        Car car = director.buildCar();
        log.info("Client- main- car:{}", gson.toJson(car));
    }
}
