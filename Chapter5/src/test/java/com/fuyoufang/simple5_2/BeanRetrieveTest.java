package com.fuyoufang.simple5_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertNotNull;

@ContextConfiguration("classpath:com/fuyoufang/simple5_2/beans.xml")
public class BeanRetrieveTest extends AbstractTestNGSpringContextTests {
    @Autowired
    ApplicationContext context;

    @Test
    public void testGetCar() throws Exception {
        Car car = context.getBean("car", Car.class);
        assertNotNull(car);
    }
}
