package com.fuyoufang.advice7_3;

import org.springframework.aop.IntroductionInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration("classpath:com/fuyoufang/advice7_3/beans.xml")
public class AdviceTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private ApplicationContext context = null;

    @Test
    public void testAdvice() throws Exception {
        Waiter waiter = context.getBean("waiter", Waiter.class);
        waiter.serveTo("fang");
        waiter.greetTo("fang");
    }
}
