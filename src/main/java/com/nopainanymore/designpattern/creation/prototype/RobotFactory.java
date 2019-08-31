package com.nopainanymore.designpattern.creation.prototype;

import java.util.HashMap;

/**
 * design-pattern: RobotFactory
 *
 * @author nopainanymore
 * @version 2019-07-31 20:16
 */
public class RobotFactory {

    private static HashMap<String, RobotPrototype> robotMap = new HashMap<>();

    public static RobotPrototype getRobot(String type) {
        RobotPrototype robot = robotMap.get(type);
        return (RobotPrototype) robot.clone();
    }

    static {
        FighterRobot fighterRobot = new FighterRobot();
        HelperRobot helperRobot = new HelperRobot();
        robotMap.put(fighterRobot.getRobotType(), fighterRobot);
        robotMap.put(helperRobot.getRobotType(), helperRobot);
    }


}
