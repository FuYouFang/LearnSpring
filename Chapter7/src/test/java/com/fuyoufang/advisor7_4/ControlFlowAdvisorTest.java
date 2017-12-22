package com.fuyoufang.advisor7_4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;


@ContextConfiguration("classpath:com/fuyoufang/advisor7_4/beans.xml")
public class ControlFlowAdvisorTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private ApplicationContext context = null;

    @Test
    public void testDynamic() throws Exception {
        Waiter waiter = context.getBean("waiter3", Waiter.class);
        waiter.greetTo("fang");
        waiter.serveTo("fang");

        System.out.println("-------------");
        WaiterDelegate delegate = new WaiterDelegate();
        delegate.setWaiter(waiter);
        delegate.service("fang");
    }
}
