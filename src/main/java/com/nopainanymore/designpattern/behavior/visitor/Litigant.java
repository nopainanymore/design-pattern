package com.nopainanymore.designpattern.behavior.visitor;

import lombok.Getter;
import lombok.Setter;

/**
 * design-pattern: Litigant 当事人
 *
 * @author nopainanymore
 * @version 2019-11-12 16:54
 */
@Getter
@Setter
public abstract class Litigant {

    protected String evidence;

    protected String Testimony;

    public Litigant(String evidence, String testimony) {
        this.evidence = evidence;
        this.Testimony = testimony;
    }

    abstract void accept(Judge judge);
}
