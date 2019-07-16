package com.nopainanymore.designpattern.constructure.proxy.jdk;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * design-pattern: JDKProxy
 *
 * @author NoPainAnymore
 * @date 2019-05-04 16:15
 */
@Slf4j
public class JDKProxy implements InvocationHandler {

    private EClass target;

    public JDKProxy(EClass target) {
        this.target = target;
    }

    public ExInterface createProxy(){
        return (ExInterface) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.equals(ExInterface.class.getDeclaredMethod("execute"))) {
            log.info("JDKProxy- invoke- before");
            Object result = method.invoke(target, args);
            log.info("JDKProxy- invoke- after");
            return result;
        }
        return method.invoke(target, args);
    }



}
