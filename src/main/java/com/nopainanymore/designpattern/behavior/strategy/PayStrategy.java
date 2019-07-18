package com.nopainanymore.designpattern.behavior.strategy;

import java.math.BigDecimal;

/**
 * design-pattern: PayStrategy
 *
 * @author NoPainAnymore
 * @date 2019-07-18 22:09
 */
public interface PayStrategy {

    PayState pay(String account, BigDecimal amount);

}
