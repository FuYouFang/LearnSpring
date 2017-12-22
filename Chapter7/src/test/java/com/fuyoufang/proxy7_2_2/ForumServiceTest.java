package com.fuyoufang.proxy7_2_2;

import org.testng.annotations.Test;

import java.lang.reflect.Proxy;

public class ForumServiceTest {
    @Test
    public void proxy() {
        // 使用JDK动态代理
        ForumService target = new ForumServiceImpl();
        PerformaceHandler handler = new PerformaceHandler(target);
        ForumService forumService = (ForumService)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);
        forumService.removeForum(10);
        forumService.removeTopic(1012);


        //使用CGLib动态代理
//        CglibProxy cglibProxy = new CglibProxy();
//        ForumService forumService = (ForumService)cglibProxy.getProxy(ForumServiceImpl.class);
//        forumService.removeForum(10);
//        forumService.removeTopic(1023);

    }
}
