package com.nopainanymore.designpattern.behavior.strategy;

import java.util.concurrent.ConcurrentHashMap;

/**
 * design-pattern: PayStrategyCollection
 *
 * @author NoPainAnymore
 * @date 2019-07-18 22:22
 */
public class PayStrategyCollection {

//    private static final String STRATEGY_IMPL_PACKAGE = "com.nopainanymore.designpattern.behavior.strategy";

    private static ConcurrentHashMap<String, PayStrategy> payStrategyConcurrentHashMap;

    // if PayStrategyImpl is @Component can use custom annotation annotate them
    // then use org.apache.ibatis.io.ResolverUtil find these and use SpringContextAware(http://nopainanymore.me/SpringBoot-ApplicationContext-Bean-Util/)
    // get the bean to initial payStrategyConcurrentHashMap

    static {
        payStrategyConcurrentHashMap = new ConcurrentHashMap<>();
        payStrategyConcurrentHashMap.put("ALI", new AliPay());
        payStrategyConcurrentHashMap.put("WECHAT", new WechatPay());
        payStrategyConcurrentHashMap.put("PAYPAL", new PayPalPay());
    }

    public static PayStrategy getStrategy(String strategyName) {
        return payStrategyConcurrentHashMap.get(strategyName);
    }


}
