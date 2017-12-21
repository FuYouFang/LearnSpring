package com.fuyoufang.placeholder6_3_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration("classpath:com/fuyoufang/placeholder6_3_2/beans.xml")
public class PlaceHolderTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private ApplicationContext context = null;

    @Test
    public void testProp() throws Exception {


//        MyDataSource dataSource = context.getBean("dataSource", MyDataSource.class);
//        System.out.println(dataSource);

    }
}
