package com.fuyoufang.anno5_10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@ContextConfiguration("classpath*:com/fuyoufang/anno5_10/mycomponent.xml")
public class MyComponentTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private ApplicationContext context;

    @Test
    public void testList() throws Exception {
        MyComponent component = context.getBean(MyComponent.class);
        assertEquals(component.getPlugins().size(), 2);

    }
}
