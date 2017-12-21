package com.fuyoufang.event6_6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration("classpath:com/fuyoufang/event6_6/beans.xml")
public class EventTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private ApplicationContext context;

    @Test
    public void testEvent() throws Exception {
        MailSender sender = context.getBean("mailSender", MailSender.class);
        sender.sendMail("12@163.com");

    }
}
