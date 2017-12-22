package com.fuyoufang.introduce7_3_6;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration("classpath:com/fuyoufang/introduce7_3_6/beans.xml")
public class IntroduceTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private ApplicationContext context = null;

    @Test
    public void testIntroduce() throws Exception {
        ForumService formService = (ForumService)context.getBean("forumService");
        formService.removeForum(10);
        formService.removeTopic(12);

        Monitorable monitorable = (Monitorable)formService;
        monitorable.setMonitorActive(true);

        formService.removeForum(10);
        formService.removeTopic(12);
    }
}
