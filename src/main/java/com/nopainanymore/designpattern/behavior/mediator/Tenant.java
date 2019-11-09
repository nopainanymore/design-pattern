package com.nopainanymore.designpattern.behavior.mediator;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * design-pattern: Tenant
 *
 * @author nopainanymore
 * @version 2019-11-08 22:32
 */
@Getter
@Setter
@Slf4j
public class Tenant extends RentUser {

    private RentMediator rentMediator;

    private Integer roomSize;

    private BigDecimal rent;

    public Tenant(RentMediator rentMediator, Integer roomSize, BigDecimal rent) {
        this.rentMediator = rentMediator;
        this.roomSize = roomSize;
        this.rent = rent;
        rentMediator.setTenant(this);
    }

    @Override
    BigDecimal pay() {
        return BigDecimal.valueOf(500);
    }

    public void withdrawMoney(BigDecimal withdraw) {
        log.info("Tenant- withdrawMoney- {}", withdraw);
    }

    public void requireRoom() {
        log.info("Tenant- requireRoom- roomSize:{},rent:{}", roomSize, rent);
        rentMediator.requireRoom(roomSize, rent);
    }
}
