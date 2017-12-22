package com.fuyoufang.autoproxy7_5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration("classpath:com/fuyoufang/autoproxy7_5/beans.xml")
public class AutoproxyTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private ApplicationContext context = null;

    @Test
    public void testDynamic() throws Exception {
        Waiter waiter = context.getBean("waiter", Waiter.class);
        Seller seller = context.getBean("seller", Seller.class);
        System.out.println("----");
        waiter.greetTo("fang");
        System.out.println("----");
        waiter.serveTo("fang");
        System.out.println("----");
        seller.greetTo("fang");
    }
}