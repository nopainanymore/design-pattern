package com.nopainanymore.designpattern.behavior.mediator;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * design-pattern: Tenant
 *
 * @author nopainanymore
 * @version 2019-11-08 22:32
 */
@Getter
@Setter
public class Tenant extends RentUser {

    private RentMediator rentMediator;

    private Integer roomSize;

    private BigDecimal rent;

    public Tenant(Integer roomSize, BigDecimal rent) {
        this.roomSize = roomSize;
        this.rent = rent;
    }

    public void requireRoom() {
        rentMediator.requireRoom(roomSize, rent);
    }

}
