package com.fuyoufang.advisor7_4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration("classpath:com/fuyoufang/advisor7_4/beans.xml")
public class DynamicAdvisorTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private ApplicationContext context = null;

    @Test
    public void testDynamic() throws Exception {
        Waiter waiter = context.getBean("waiter2", Waiter.class);
        System.out.println("-------greetTo-------");
        waiter.greetTo("fang");
        System.out.println("-------greetTo-------");
        waiter.greetTo("fang");
        System.out.println("-------serveTo-------");
        waiter.serveTo("fang");
        System.out.println("-------serveTo-------");
        waiter.serveTo("fang");
    }
}
