package com.nopainanymore.designpattern.behavior.visitor;

import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: EvidenceJudge
 *
 * @author nopainanymore
 * @version 2019-11-12 17:14
 */
@Slf4j
public class EvidenceJudge implements Judge {

    @Override
    public void visitPlaintiff(Plaintiff plaintiff) {
        log.info("EvidenceJudge- visitPlaintiff- {}", plaintiff.getEvidence());
    }

    @Override
    public void visitDefendant(Defendant defendant) {
        log.info("EvidenceJudge- visitDefendant- {}", defendant.getEvidence());
    }
}
