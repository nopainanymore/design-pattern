package com.nopainanymore.designpattern.behavior.mediator;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * design-pattern: ConcreteRentMediator
 *
 * @author nopainanymore
 * @version 2019-11-08 22:38
 */
@Slf4j
public class ConcreteRentMediator extends RentMediator {

    private static Gson gson = new Gson();

    private Landlord landlord;

    private Tenant tenant;

    private RentContext rentContext;

    public ConcreteRentMediator(Landlord landlord, Tenant tenant) {
        this.landlord = landlord;
        this.tenant = tenant;
        this.landlord.setRentMediator(this);
        this.tenant.setRentMediator(this);
    }

    @Override
    public void deal() {
        tenant.requireRoom();

        landlord.offerRoom(rentContext.getRoomSize(), rentContext.getRent());

        log.info("ConcreteRentMediator- deal- {}", gson.toJson(rentContext));
    }

    @Override
    public void offerRoom(Boolean hasRoom) {
        this.rentContext.setHasRoom(hasRoom);
        log.info("ConcreteRentMediator- offerRoom- {}", hasRoom);
    }

    @Override
    void requireRoom(Integer roomSize, BigDecimal rent) {
        this.rentContext = new RentContext(roomSize, rent);
    }
}
