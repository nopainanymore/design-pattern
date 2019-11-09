package com.nopainanymore.designpattern.behavior.mediator;

import java.math.BigDecimal;

/**
 * design-pattern: RentMediator
 *
 * @author nopainanymore
 * @version 2019-11-08 22:31
 */
public abstract class RentMediator {

    protected Landlord landlord;

    protected Tenant tenant;

    protected BigDecimal mediatorMoney;

    abstract void receiveMoney(BigDecimal money);

    abstract void offerRoom(Boolean hasRoom);

    abstract void requireRoom(Integer roomSize, BigDecimal rent);

    public Landlord getLandlord() {
        return landlord;
    }

    public void setLandlord(Landlord landlord) {
        this.landlord = landlord;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }
}
