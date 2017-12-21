package com.fuyoufang.scope5_8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotSame;

@ContextConfiguration("classpath*:com/fuyoufang/scope5_8/beans.xml")
public class ScopeTest extends AbstractTestNGSpringContextTests {

    @Autowired
    @Qualifier("boss1")
    private Boss boss1;

    @Autowired
    @Qualifier("boss2")
    private Boss boss2;

    @Autowired
    @Qualifier("boss3")
    private Boss boss3;

    @Autowired
    ApplicationContext context;

    @Test
    public void testInject() throws Exception {
        assertNotSame(boss1.getCar(), boss2.getCar());
        assertNotSame(boss2.getCar(), boss3.getCar());
    }

    @Test
    public void testGetBean() throws Exception {
        assertNotSame(context.getBean("car"), context.getBean("car"));
    }
}
