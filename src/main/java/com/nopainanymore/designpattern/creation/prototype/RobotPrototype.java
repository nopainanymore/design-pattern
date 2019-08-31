package com.nopainanymore.designpattern.creation.prototype;

import lombok.Data;

/**
 * design-pattern: RobotPrototype
 *
 * @author nopainanymore
 * @version 2019-07-31 00:08
 */
@Data
public abstract class RobotPrototype implements Cloneable {

    private Integer id;

    protected String robotType;

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
