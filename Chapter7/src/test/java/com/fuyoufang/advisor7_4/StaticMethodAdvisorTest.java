package com.fuyoufang.advisor7_4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration("classpath:com/fuyoufang/advisor7_4/beans.xml")
public class StaticMethodAdvisorTest extends AbstractTestNGSpringContextTests {
    @Autowired
    ApplicationContext context = null;

    @Test
    public void testStaticMethodAdvisor() throws Exception {
        Waiter waiter = context.getBean("waiter", Waiter.class);
        Seller seller = context.getBean("seller", Seller.class);
        waiter.greetTo("fang");
        waiter.serveTo("fang");
        seller.greetTo("fang");
    }
}
