package com.nopainanymore.designpattern.behavior.visitor;

/**
 * design-pattern: Judge 法官
 *
 * @author nopainanymore
 * @version 2019-11-12 16:53
 */
public interface Judge {

    void visitPlaintiff(Plaintiff plaintiff);

    void visitDefendant(Defendant defendant);

}
