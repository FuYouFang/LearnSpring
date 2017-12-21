package com.fuyoufang.impt5_7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration("classpath:com/fuyoufang/impt5_7/beans2.xml")
public class ImportTest extends AbstractTestNGSpringContextTests {
    @Autowired
    ApplicationContext applicationContext = null;

    @Test
    public void testCar() throws Exception {
        Boss boss = applicationContext.getBean("boss1", Boss.class);
        System.out.println(boss.getCar().getBrand());
    }
}
