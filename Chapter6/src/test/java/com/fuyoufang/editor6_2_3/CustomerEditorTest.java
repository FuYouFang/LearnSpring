package com.fuyoufang.editor6_2_3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertNotNull;

@ContextConfiguration("classpath:com/fuyoufang/editor6_2_3/beans.xml")
public class CustomerEditorTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private ApplicationContext context;

    @Test
    public void testEditor() throws Exception {
        Boss boss = context.getBean("boss", Boss.class);
        assertNotNull(boss);
        System.out.println(boss.getCar().brand);
        System.out.println(boss.getHouse().getAddress());
    }
}
