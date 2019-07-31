package com.nopainanymore.designpattern.creation.prototype;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: Client
 *
 * @author NoPainAnymore
 * @date 2019-07-30 23:51
 */
@Slf4j
public class Client {

    private static Gson gson = new Gson();

    public static void main(String[] args) {
        RobotPrototype fighter0 = RobotFactory.getRobot("fighter");
        RobotPrototype fighter1 = RobotFactory.getRobot("fighter");
        fighter0.setId(0);
        fighter1.setId(1);
        log.info("Client- main:{}", gson.toJson(fighter0));
        log.info("Client- main:{}", gson.toJson(fighter1));
        log.info("Client- main- fighter0.hashCode:{}", fighter0.hashCode());
        log.info("Client- main- fighter1.hashCode:{}", fighter1.hashCode());
    }
}
