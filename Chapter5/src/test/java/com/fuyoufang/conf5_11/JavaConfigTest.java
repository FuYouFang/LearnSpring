package com.fuyoufang.conf5_11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.xml.ws.Service;

import static org.testng.AssertJUnit.assertNotNull;

public class JavaConfigTest {
    private ApplicationContext context = null;

    @BeforeMethod
    public void setUp() throws Exception {
        //1.通过构造函数加载配置类
//        context = new AnnotationConfigApplicationContext(AppConf.class);
        //2.通过编码方式注册配置类
//        context = new AnnotationConfigApplicationContext();
//        ((AnnotationConfigApplicationContext)context).register(DaoConfig.class);
//        ((AnnotationConfigApplicationContext)context).register(ServiceConfig.class);
//        ((AnnotationConfigApplicationContext)context).refresh();

        //3.通过XML组装@Configuration配置类所提供的配置信息
//        context = new ClassPathXmlApplicationContext("com/fuyoufang/conf5_11/beans2.xml");

        //4.通过@Configuration组装XML配置所提供的配置信息
//		 context = new AnnotationConfigApplicationContext(LogonAppConfig.class);


        //5.@Configuration的配置类相互引用
        context = new AnnotationConfigApplicationContext(DaoConfig.class, ServiceConfig.class);
    }

    @Test
    public void testGetBean() throws Exception {
        LogonService logonService =  (LogonService) context.getBean("logonService");
        assertNotNull(logonService);
    }
}
