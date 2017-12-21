package com.fuyoufang.beanprop6_4;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration("classpath:com/fuyoufang/beanprop6_4/beans.xml")
//@ContextConfiguration("classpath:com/fuyoufang/beanprop6_4/beans1.xml")
public class PropText extends AbstractTestNGSpringContextTests {
    @Autowired
    ApplicationContext context = null;

    @Test
    public void testProp() throws Exception {
        BasicDataSource dataSource = context.getBean("dataSource", BasicDataSource.class);
        System.out.println(dataSource.getUrl());
        System.out.println(dataSource.getUsername());
        System.out.println(dataSource.getPassword());

        ApplicationManager manager = context.getBean("manager", ApplicationManager.class);
        System.out.println(manager.getSessionTimeout());
        System.out.println(manager.getMaxTabPageNum());

        MyDataSource dataSource1 = context.getBean(MyDataSource.class, MyDataSource.class);
        System.out.println(dataSource1);
    }
}
