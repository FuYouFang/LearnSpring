package com.fuyoufang.advisor7_4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration("classpath:com/fuyoufang/advisor7_4/beans.xml")
public class RegexpAdvisorTest extends AbstractTestNGSpringContextTests {
    @Autowired
    ApplicationContext context = null;

    @Test
    public void testRegexp() throws Exception {
        Waiter waiter = context.getBean("waiter1", Waiter.class);
        System.out.println("--------");
        waiter.serveTo("fang");
        System.out.println("--------");
        waiter.greetTo("fang");
        System.out.println("--------");
        waiter.tset("fang");
    }
}
