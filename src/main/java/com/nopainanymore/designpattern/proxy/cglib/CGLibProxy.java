package com.nopainanymore.designpattern.proxy.cglib;


import lombok.extern.slf4j.Slf4j;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * design-pattern: CGLibProxy
 *
 * @author NoPainAnymore
 * @date 2019-05-04 17:36
 */
@Slf4j
public class CGLibProxy implements MethodInterceptor {

    private EClass target;

    public CGLibProxy(EClass target) {
        this.target = target;
    }

    public EClass createProxy() {
        // 使用CGLIB生成代理:
        // 1.声明增强类实例,用于生产代理类
        Enhancer enhancer = new Enhancer();
        // 2.设置被代理类字节码，CGLIB根据字节码生成被代理类的子类
        enhancer.setSuperclass(target.getClass());
        // 3.//设置回调函数，即一个方法拦截
        enhancer.setCallback(this);
        // 4.创建代理:
        return (EClass) enhancer.create();
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        if (method.equals(EClass.class.getDeclaredMethod("execute"))) {
            log.info("CGLibProxy- intercept- before");
            Object result = methodProxy.invokeSuper(proxy, args);
            log.info("CGLibProxy- intercept- after");
            return result;
        }
        return methodProxy.invokeSuper(proxy, args);
    }

}
