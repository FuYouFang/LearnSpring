package com.fuyoufang.tagdepend5_6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertNotNull;

@ContextConfiguration("classpath:com/fuyoufang/tagdepend5_6/beans.xml")
public class TagDependTest extends AbstractTestNGSpringContextTests {
    
    @Autowired
    private ApplicationContext context;

    @Test
    public void testInheritTag(){
        Car car3 = context.getBean("car3", Car.class);
        Car car4 = context.getBean("car4", Car.class);
        assertNotNull(car3);
        assertNotNull(car4);
    }

    @Test
    public void testReferenceTag(){
        Boss boss = context.getBean("boss", Boss.class);
        assertNotNull(boss);
        System.out.println(boss);
    }
}
