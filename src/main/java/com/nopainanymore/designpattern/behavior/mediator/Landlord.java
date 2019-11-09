package com.nopainanymore.designpattern.behavior.mediator;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * design-pattern: Landlord
 *
 * @author nopainanymore
 * @version 2019-11-08 22:31
 */
@Slf4j
@Setter
public class Landlord extends RentUser {

    private RentMediator rentMediator;

    public Landlord(RentMediator rentMediator) {
        this.rentMediator = rentMediator;
        rentMediator.setLandlord(this);
    }

    @Override
    BigDecimal pay() {
        return BigDecimal.valueOf(500);
    }

    public void offerRoom(Integer roomSize, BigDecimal rent) {
        BigDecimal divide = rent.divide(BigDecimal.valueOf(roomSize));
        log.info("Landlord- offerRoom- divide:{}", divide);
        if (divide.compareTo(BigDecimal.valueOf(50)) >= 0) {
            rentMediator.offerRoom(true);
        } else {
            rentMediator.offerRoom(false);
        }
    }
}
