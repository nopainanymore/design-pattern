package com.nopainanymore.designpattern.behavior.visitor;

/**
 * design-pattern: Plaintiff 原告
 *
 * @author nopainanymore
 * @version 2019-11-12 16:52
 */
public class Plaintiff extends Litigant {

    public Plaintiff(String evidence, String testimony) {
        super(evidence, testimony);
    }

    @Override
    void accept(Judge judge) {
        judge.visitPlaintiff(this);
    }
}
