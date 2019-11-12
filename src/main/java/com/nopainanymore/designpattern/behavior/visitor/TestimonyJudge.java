package com.nopainanymore.designpattern.behavior.visitor;

import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: TestimonyJudge
 *
 * @author nopainanymore
 * @version 2019-11-12 17:38
 */
@Slf4j
public class TestimonyJudge implements Judge {

    @Override
    public void visitPlaintiff(Plaintiff plaintiff) {
        log.info("TestimonyJudge- visitPlaintiff- {}", plaintiff.getTestimony());
    }

    @Override
    public void visitDefendant(Defendant defendant) {
        log.info("TestimonyJudge- visitDefendant- {}", defendant.getTestimony());
    }
}
