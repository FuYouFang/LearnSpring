package com.fuyoufang.context;

import com.fuyoufang.domain.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;

public class AnnotationApplicationContextText {
    @Test
    public void testGetBeans() throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(Beans.class);
        Object car = context.getBean("car", Car.class);
        System.out.println(car);
    }
}
