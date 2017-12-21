package com.fuyoufang.fb5_9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotSame;
import static org.testng.AssertJUnit.assertNotNull;

@ContextConfiguration("classpath:com/fuyoufang/fb5_9/beans.xml")
public class FactoryBeanTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private ApplicationContext context = null;

    @Test
    public void testCarFactoryBean() throws Exception {
        Car car_1 = context.getBean("car1", Car.class);
        Car car_2 = context.getBean("car1", Car.class);
        assertNotNull(car_1);
        assertNotSame(car_1, car_2);
    }

    @Test
    public void testCollFactoryBean() {
        List list = context.getBean("favoriteList", List.class);
        Set set = context.getBean("favoriteSet", Set.class);
        Map map = context.getBean("emails", Map.class);
        Properties props = context.getBean("emailProps", Properties.class);
        assertEquals(set.size(), 2);
        assertEquals(list.size(), 2);
        assertEquals(map.size(), 2);
        assertEquals(props.size(), 2);
    }

    @Test
    public void testFieldFactoryBean() {
        Car car2 = context.getBean("car2", Car.class);
        assertNotNull(car2);
        System.out.println(car2);
    }

    @Test
    public void testPropPathFactoryBean() {
        Car car5 = context.getBean("car5", Car.class);
        Car car6 = context.getBean("car6", Car.class);
        assertNotNull(car5);
        assertNotNull(car6);
        System.out.println(car5);
        System.out.println(car6);
    }
}
