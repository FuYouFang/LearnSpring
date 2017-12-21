package com.fuyoufang.attr5_4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertNotNull;

public class BeanAttrDITest {
    public ApplicationContext factory = null;

    private static String[] CONFIG_FILES = { "com/fuyoufang/attr5_4/beans.xml" };

    @BeforeClass
    public void setUp() throws Exception {
        factory = new ClassPathXmlApplicationContext(CONFIG_FILES);
    }

    @Test
    public void testBeanRetrieveCar() {
        Car car = (Car) factory.getBean("car");
        assertNotNull(car);
        System.out.println(""+car);
    }

    @Test
    public void testBeanRetrieveBoss() {
        Boss boss1 = (Boss) factory.getBean("boss1");
        Boss boss2 = (Boss) factory.getBean("boss2");
        assertTrue(boss1.getCar() != boss2.getCar());
    }


    @Test
    public void testBeanRetrieveBoss1() {
        Boss boss1 = (Boss) factory.getBean("boss1");
        assertNotNull(boss1);
        System.out.println("boss1:"+boss1);
    }

    @Test
    public void testBeanRetrieveChildBoss() {
        Boss childBoss = (Boss) factory.getBean("childBoss");
        assertNotNull(childBoss);
        System.out.println("childBoss:"+childBoss);
    }

    @Test
    public void testCascadeAttr(){
        Car car = (Car) factory.getBean("car");
        SportsCar sportsCar = (SportsCar)factory.getBean("sportsCar");
        assertEquals(car.getBrand(), sportsCar.getBrand());
        System.out.println(sportsCar.getBrand());
    }

    @Test
    public void testBrand() throws Exception {
        String brand = (String) factory.getBean("brand");
        System.out.println(brand);
    }
}
