package com.fuyoufang.anno5_10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;
import static org.testng.AssertJUnit.assertNotSame;

public class AnnoAutowireTest {
    private ApplicationContext context = null;
    private static String[] CONFIG_FILES = { "com/fuyoufang/anno5_10/beans.xml" };

        @BeforeMethod
        public void setUp() throws Exception {
            context = new ClassPathXmlApplicationContext(CONFIG_FILES);
        }

        @Test
        public void testAutoByName(){
            Boss boss1 = (Boss) context.getBean("boss");
            assertNotNull(boss1);
            Car car1 = boss1.getCar();
            Boss boss2 = (Boss) context.getBean("boss");
            assertNotNull(boss2);
            Car car2 = boss2.getCar();

            assertEquals(boss1, boss2);
            System.out.println(car1 == car2);
//            assertNotSame(car1, car2);

            ((ClassPathXmlApplicationContext)context).close();
        }
}
