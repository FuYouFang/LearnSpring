package com.fuyoufang.advice7_3;

import org.springframework.aop.framework.ProxyFactory;
import org.testng.annotations.Test;

public class BeforeAdviceTest {
    @Test
    public void testAdvice() throws Exception {
        Waiter target = new NaiveWaiter();
        GreetingBeforeAdvice advice = new GreetingBeforeAdvice();

        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(target);
        proxyFactory.addAdvice(advice);
        proxyFactory.setInterfaces(target.getClass().getInterfaces());
        proxyFactory.setOptimize(true);

        Waiter waiter = (Waiter)proxyFactory.getProxy();
        waiter.greetTo("fang");
        waiter.serveTo("fang");
    }
}
