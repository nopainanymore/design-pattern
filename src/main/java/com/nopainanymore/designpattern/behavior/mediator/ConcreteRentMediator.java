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

    private RentContext rentContext;

    public ConcreteRentMediator() {
    }

    @Override
    void receiveMoney(BigDecimal money) {
        if (this.mediatorMoney == null) {
            this.mediatorMoney = money;
        } else {
            this.mediatorMoney = this.mediatorMoney.add(money);
        }
    }

    @Override
    public void offerRoom(Boolean hasRoom) {
        this.rentContext.setHasRoom(hasRoom);
        if (hasRoom) {
            receiveMoney(landlord.pay());
        } else {
            tenant.withdrawMoney(this.mediatorMoney);
            this.mediatorMoney = BigDecimal.ZERO;
        }
        log.info("ConcreteRentMediator- offerRoom- {}", hasRoom);
        log.info("ConcreteRentMediator- offerRoom- done earn {} money", this.mediatorMoney);
    }

    @Override
    void requireRoom(Integer roomSize, BigDecimal rent) {
        this.rentContext = new RentContext(roomSize, rent);
        receiveMoney(tenant.pay());
        landlord.offerRoom(rentContext.getRoomSize(), rentContext.getRent());
    }
}
