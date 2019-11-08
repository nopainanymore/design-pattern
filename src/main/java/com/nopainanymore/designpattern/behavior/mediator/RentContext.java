package com.nopainanymore.designpattern.behavior.mediator;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * design-pattern: RentContext
 *
 * @author nopainanymore
 * @version 2019-11-08 22:54
 */
@Getter
@Setter
public class RentContext {

    private Integer roomSize;

    private BigDecimal rent;

    private Boolean hasRoom;

    public RentContext(Integer roomSize, BigDecimal rent) {
        this.roomSize = roomSize;
        this.rent = rent;
    }
}
