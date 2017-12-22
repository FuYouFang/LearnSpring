package com.fuyoufang.proxy7_2_3;


import org.testng.annotations.Test;

import java.lang.reflect.Proxy;

public class ForumServiceTest {
    @Test
    public void proxy() {

        //使用CGLib动态代理
        CglibProxy cglibProxy = new CglibProxy();
        ForumService forumService = (ForumService)cglibProxy.getProxy(ForumServiceImpl.class);
        forumService.removeForum(10);
        forumService.removeTopic(1023);

    }
}
