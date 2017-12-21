package com.fuyoufang.attr5_4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class ParentContainerBeanTest {
    @Test
    public void testBeans() throws Exception {
        ApplicationContext parentContext = new ClassPathXmlApplicationContext("com/fuyoufang/attr5_4/beans1.xml");
        ApplicationContext childContext = new ClassPathXmlApplicationContext(new String[] {"com/fuyoufang/attr5_4/beans2.xml"}, parentContext);

        Boss boss = (Boss) childContext.getBean("boss");
        System.out.println(boss.getCar());

    }
}
