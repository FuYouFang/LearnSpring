package com.fuyoufang.beanfactory;

import com.fuyoufang.domain.Car;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BeanLifeCycle {
    private static void LifeCycleInBeanFactory(){

        Resource res = new ClassPathResource("com/fuyoufang/beanfactory/beans.xml");

        BeanFactory bf= new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader((DefaultListableBeanFactory)bf);
        reader.loadBeanDefinitions(res);

        // 向容器中注册MyBeanPostProcessor后处理器
        ((ConfigurableBeanFactory)bf).addBeanPostProcessor(new MyBeanPostProcessor());

        //向容器中注册MyInstantiationAwareBeanPostProcessor后处理器
        ((ConfigurableBeanFactory)bf).addBeanPostProcessor(
                new MyInstantiationAwareBeanPostProcessor());
        //④第一次从容器中获取car，将触发容器实例化该Bean，这将引发Bean生命周期方法的调用。
        Car car1 = (Car)bf.getBean("car");
        System.out.println(car1);
        car1.setColor("红色");

        //⑤第二次从容器中获取car，直接从缓存池中获取
        Car car2 = (Car)bf.getBean("car");

        //⑥查看car1和car2是否指向同一引用
        System.out.println("car1==car2:"+(car1==car2));
        //⑦关闭容器
        ((DefaultListableBeanFactory)bf).destroySingletons();

    }
    public static void main(String[] args) {
        LifeCycleInBeanFactory();
    }
}
