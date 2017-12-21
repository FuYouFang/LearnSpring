package com.fuyoufang.event6_6;

import org.springframework.context.ApplicationListener;

public class MailSendListener implements ApplicationListener<MailSendEvent> {
    @Override
    public void onApplicationEvent(MailSendEvent event) {
        System.out.println("收到事件向" + event.getTo() + "发了邮件");
    }
}
