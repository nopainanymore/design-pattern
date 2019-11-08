package com.nopainanymore.designpattern.behavior.mediator;

import java.math.BigDecimal;

/**
 * design-pattern: Client
 *
 * @author nopainanymore
 * @version 2019-11-08 22:57
 */
public class Client {

    public static void main(String[] args) {
        Tenant tenant = new Tenant(20, BigDecimal.valueOf(1000));
        Landlord landlord = new Landlord();
        RentMediator rentMediator = new ConcreteRentMediator(landlord, tenant);
        rentMediator.deal();
    }

}
