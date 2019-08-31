package com.nopainanymore.designpattern.behavior.strategy;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * design-pattern: PayPalPay
 *
 * @author nopainanymore
 * @version 2019-07-18 22:17
 */
@Slf4j
@Data
public class PayPalPay implements PayStrategy {

    @Override
    public PayState pay(String account, BigDecimal amount) {
        log.info("PayPalPay- pay- account:{}, amount:{}", account, amount);
        return PayState.builder().state(false).msg("network error").build();
    }
}
