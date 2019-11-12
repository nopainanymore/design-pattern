package com.nopainanymore.designpattern.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * design-pattern: LitigantGroup
 *
 * @author nopainanymore
 * @version 2019-11-12 17:33
 */
public class LitigantGroup {

    private List<Litigant> litigantList = new ArrayList<>();

    public void addLitigant(Litigant litigant) {
        this.litigantList.add(litigant);
    }

    public void accept(Judge judge) {
        litigantList.forEach(litigant -> litigant.accept(judge));
    }
}
