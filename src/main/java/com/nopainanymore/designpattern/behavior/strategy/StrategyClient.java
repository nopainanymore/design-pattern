package com.nopainanymore.designpattern.behavior.strategy;

import java.math.BigDecimal;

/**
 * design-pattern: StrategyClient
 *
 * @author nopainanymore
 * @version 2019-07-18 22:40
 */
public class StrategyClient {


    public static void main(String[] args) {
        String account = "myAccount";
        BigDecimal amount = BigDecimal.valueOf(10000L);
        PayStrategyEnum.ALI_PAY.getPayStrategy().pay(account, amount);
        PayStrategyEnum.WECHAT_PAY.getPayStrategy().pay(account, amount);
        PayStrategyEnum.PAYPAL_PAY.getPayStrategy().pay(account, amount);
        PayStrategyCollection.getStrategy("ALI").pay(account, amount);
        PayStrategyCollection.getStrategy("WECHAT").pay(account, amount);
        PayStrategyCollection.getStrategy("PAYPAL").pay(account, amount);
    }
}
