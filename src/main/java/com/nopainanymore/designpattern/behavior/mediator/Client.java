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
        RentMediator rentMediator = new ConcreteRentMediator();
        Tenant tenant = new Tenant(rentMediator, 20, BigDecimal.valueOf(1000));
        Landlord landlord = new Landlord(rentMediator);
        tenant.requireRoom();

        RentMediator rentMediator1 = new ConcreteRentMediator();
        Tenant tenant1 = new Tenant(rentMediator1, 20, BigDecimal.valueOf(500));
        Landlord landlord1 = new Landlord(rentMediator1);
        tenant1.requireRoom();
    }
}
