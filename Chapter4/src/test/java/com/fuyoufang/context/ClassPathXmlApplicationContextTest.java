package com.fuyoufang.context;

import com.fuyoufang.domain.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.testng.annotations.Test;

public class ClassPathXmlApplicationContextTest {
    @Test
    public void testContext() throws Exception {
        //ApplicationContext ctx = new FileSystemXmlApplicationContext("");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/fuyoufang/context/beans1.xml",
                "com/fuyoufang/context/beans2.xml");

        System.out.println(ctx.getBeanDefinitionNames());
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);
        car = (Car) ctx.getBean("car2");
        System.out.println(car);
    }
}
