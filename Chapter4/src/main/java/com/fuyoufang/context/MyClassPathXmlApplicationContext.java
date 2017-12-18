package com.fuyoufang.context;

import com.fuyoufang.domain.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClassPathXmlApplicationContext {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/fuyoufang/context/beans1.xml",
                "com/fuyoufang/context/beans2.xml");

        System.out.println(ctx.getBeanDefinitionNames());
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);
        car = (Car) ctx.getBean("car2");
        System.out.println(car);
    }
}
