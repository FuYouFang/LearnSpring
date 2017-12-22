package com.fuyoufang.advisor7_4;

import com.fuyoufang.introduce7_3_6.ForumService;
import com.fuyoufang.introduce7_3_6.Monitorable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration("classpath:com/fuyoufang/advisor7_4/beans.xml")
public class IntroduceAdvisorTest extends AbstractTestNGSpringContextTests {

    @Autowired
    ApplicationContext context = null;

    @Test
    public void testIntroduce() throws Exception {
        ForumService forumService = context.getBean("forumService", ForumService.class);
        forumService.removeForum(10);
        Monitorable moniterable = (Monitorable)forumService;
        moniterable.setMonitorActive(true);
        forumService.removeForum(10);

    }
}
