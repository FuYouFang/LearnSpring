package com.fuyoufang.injectfun5_5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotSame;

@ContextConfiguration("classpath:com/fuyoufang/injectfun5_5/beans.xml")
public class InjectFunTest extends AbstractTestNGSpringContextTests {
    @Autowired
    public ApplicationContext context = null;

    @Test
    public void testLookup(){
        MagicBoss mboss = context.getBean("magicBoss", MagicBoss.class);
        assertNotSame(mboss.getCar(), mboss.getCar());
    }

    @Test
    public void testReplace(){
        MagicBoss mboss = context.getBean("boss1", MagicBoss.class);
        assertEquals(mboss.getCar().getBrand(),"美人豹");
    }
}
