package com.nopainanymore.designpattern.behavior.memento;

import lombok.Getter;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * design-pattern: CheckPoint
 *
 * @author nopainanymore
 * @version 2019-11-13 14:59
 */
@Getter
public class CheckPoint {

    private static AtomicInteger idGenerator = new AtomicInteger(0);

    private Integer id;

    private Long epochMilliSecond;

    private String status;

    private CheckPoint(String status) {
        this.id = idGenerator.incrementAndGet();
        this.status = status;
        this.epochMilliSecond = System.currentTimeMillis();
    }

    public static CheckPoint of(String status) {
        return new CheckPoint(status);
    }
}
