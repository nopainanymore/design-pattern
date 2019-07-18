package com.nopainanymore.designpattern.behavior.strategy;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * design-pattern: AliPay
 *
 * @author NoPainAnymore
 * @date 2019-07-18 22:13
 */
@Slf4j
@Data
public class AliPay implements PayStrategy {

    @Override
    public PayState pay(String account, BigDecimal amount) {
        log.info("AliPay- pay- account:{}, amount:{}", account, amount);
        return PayState.builder().state(true).msg("pay success").build();
    }
}
