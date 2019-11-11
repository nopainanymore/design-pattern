package com.nopainanymore.designpattern.creation.prototype;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: PrototypeClient
 *
 * @author nopainanymore
 * @version 2019-07-30 23:51
 */
@Slf4j
public class PrototypeClient {

    private static Gson gson = new Gson();

    public static void main(String[] args) {
        RobotPrototype fighter0 = RobotFactory.getRobot("fighter");
        RobotPrototype fighter1 = RobotFactory.getRobot("fighter");
        log.info("Client- main- equals?: {}", fighter0 == fighter1);
        fighter0.setId(0);
        fighter1.setId(1);
        log.info("Client- main: fighter0:{}, fighter1:{}", gson.toJson(fighter0), gson.toJson(fighter1));
        log.info("Client- main- fighter0.hashCode:{}，fighter1.hashCode:{}", fighter0.hashCode(), fighter1.hashCode());
    }
}
