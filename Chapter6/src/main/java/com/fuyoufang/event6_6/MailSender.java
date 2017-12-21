package com.fuyoufang.event6_6;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MailSender implements ApplicationContextAware {

    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context = context;
    }

    public void sendMail(String to) {
        System.out.println("模拟发送邮件..");
        MailSendEvent event = new MailSendEvent(context, to);
        context.publishEvent(event);
    }
}
