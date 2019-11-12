package com.nopainanymore.designpattern.behavior.visitor;

/**
 * design-pattern: VisitorClient
 *
 * @author nopainanymore
 * @version 2019-11-12 11:21
 */
public class VisitorClient {

    public static void main(String[] args) {
        LitigantGroup group = new LitigantGroup();
        Plaintiff plaintiff = new Plaintiff("plaintiff_evidence", "plaintiff_testimony");
        Defendant defendant = new Defendant("defendant_evidence", "defendant_testimony");
        group.addLitigant(plaintiff);
        group.addLitigant(defendant);

        EvidenceJudge evidenceJudge = new EvidenceJudge();
        TestimonyJudge testimonyJudge = new TestimonyJudge();
        group.accept(evidenceJudge);
        group.accept(testimonyJudge);
    }
}
