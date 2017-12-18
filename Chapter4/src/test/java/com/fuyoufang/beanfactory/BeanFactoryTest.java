package com.fuyoufang.beanfactory;

import com.fuyoufang.domain.Car;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.testng.annotations.Test;

public class BeanFactoryTest {

    @Test
    public void testGetBean() throws Exception {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();;
        Resource resource = resolver.getResource("classpath:beans.xml");

        System.out.println(resource.getURL());
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(resource);

        System.out.println("init BeanFactory");
        Car car = factory.getBean("car", Car.class);
        System.out.print(car);
    }
}
