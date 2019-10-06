package com.nopainanymore.designpattern.constructure.flyweight;

import java.util.HashMap;

/**
 * design-pattern: FlyWeightFactory
 *
 * @author nopainanymore
 * @version 2019-09-22 21:25
 */
public class FlyWeightFactory {

    private static HashMap<String, FlyWeight> flyWeightHashMap = new HashMap<>();

    static FlyWeight getFlyWeight(String unchangeable) {
        if (!flyWeightHashMap.containsKey(unchangeable)) {
            FlyWeight flyWeight = new ConcreteFlyWeight(unchangeable);
            flyWeightHashMap.put(unchangeable, flyWeight);
            return flyWeight;
        }
        return flyWeightHashMap.get(unchangeable);
    }

}
