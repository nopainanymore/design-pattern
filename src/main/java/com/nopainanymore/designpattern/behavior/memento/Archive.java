package com.nopainanymore.designpattern.behavior.memento;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * design-pattern: Archive
 *
 * @author nopainanymore
 * @version 2019-11-13 15:08
 */
public class Archive {

    private Map<Integer, CheckPoint> checkPointMap = new HashMap<>();

    public void addCheckPoint(CheckPoint checkPoint) {
        checkPointMap.put(checkPoint.getId(), checkPoint);
    }

    public Optional<CheckPoint> getCheckPoint(Integer id) {
        return Optional.of(checkPointMap.get(id));
    }
}
