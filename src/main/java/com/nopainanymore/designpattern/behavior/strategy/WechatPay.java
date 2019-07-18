package com.nopainanymore.designpattern.behavior.strategy;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * design-pattern: WechatPay
 *
 * @author NoPainAnymore
 * @date 2019-07-18 22:15
 */
@Slf4j
@Data
public class WechatPay implements PayStrategy {

    @Override
    public PayState pay(String account, BigDecimal amount) {
        log.info("WechatPay- pay- account:{}, amount:{}", account, amount);
        return PayState.builder().state(true).msg("pay success").build();
    }
}
