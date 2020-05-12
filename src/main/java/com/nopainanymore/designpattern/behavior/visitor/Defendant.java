package com.nopainanymore.designpattern.behavior.visitor;

/**
 * design-pattern: Defendant 被告
 *
 * @author nopainanymore
 * @version 2019-11-12 16:52
 */
public class Defendant extends Litigant {

    public Defendant(String evidence, String testimony) {
        super(evidence, testimony);
    }

    @Override
    void accept(Judge judge) {
        judge.visitDefendant(this);
    }
}
