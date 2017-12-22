package com.fuyoufang.advice7_3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration("classpath:com/fuyoufang/advice7_3/beans.xml")
public class ThrowAdviceTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private ApplicationContext context = null;

    @Test
    public void testThrow() throws Exception {
        ForumService forumService = context.getBean("formService", ForumService.class);

        try {
            forumService.removeForum(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            forumService.updateForum(new Forum());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
