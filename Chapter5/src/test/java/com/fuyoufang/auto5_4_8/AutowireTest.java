package com.fuyoufang.auto5_4_8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutowireTest {
    private ApplicationContext applicationContext;

    @BeforeMethod
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("com/fuyoufang/auto5_4_8/beans.xml");


    }

    @Test
    public void testGetBoss() throws Exception {
        Object boss = applicationContext.getBean("boss");
        System.out.println(boss);
    }
}
