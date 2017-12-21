package com.fuyoufang.prop6_3;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration("classpath:com/fuyoufang/prop6_3/beans.xml")
public class PropText extends AbstractTestNGSpringContextTests {
    @Autowired
    ApplicationContext context = null;

    @Test
    public void testProp() throws Exception {
        BasicDataSource dataSource = context.getBean("dataSource", BasicDataSource.class);
        System.out.println(dataSource.getUrl());
        System.out.println(dataSource.getUsername());
        System.out.println(dataSource.getPassword());

        MyDataSource dataSource1 = context.getBean(MyDataSource.class, MyDataSource.class);
        System.out.println(dataSource1);
    }
}
