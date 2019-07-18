package com.nopainanymore.designpattern.behavior.strategy;

/**
 * design-pattern: PayStrategyEnum
 *
 * @author NoPainAnymore
 * @date 2019-07-18 22:19
 */
public enum PayStrategyEnum {

    ALI_PAY(new AliPay()),
    WECHAT_PAY(new WechatPay()),
    PAYPAL_PAY(new PayPalPay()),
    ;

    private PayStrategy payStrategy;

    PayStrategyEnum(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public PayStrategy getPayStrategy() {
        return payStrategy;
    }
}
