package com.fuyoufang.advisor7_4;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;
import org.springframework.lang.Nullable;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class GreetingDynamicPointcut extends DynamicMethodMatcherPointcut {
    private static List<String> specialClientList = new ArrayList<String>();

    static {
        specialClientList.add("John");
        specialClientList.add("Tom");
    }

    @Override
    public ClassFilter getClassFilter() {
        return new ClassFilter() {
            @Override
            public boolean matches(Class<?> clazz) {
                System.out.println("调用getClassFilter()对" + clazz.getName() + "做静态检查.");
                return Waiter.class.isAssignableFrom(clazz);
            }
        };
    }

    @Override
    public boolean matches(Method method, @Nullable Class<?> targetClass) {
        System.out.println("调用matches(method,clazz)对" + targetClass.getName() + "." + method.getName() + "做静态检查.");
        return "greetTo".equals(method.getName());

    }

    @Override
    public boolean matches(Method method, @Nullable Class<?> targetClass, Object... args) {
        System.out.println("调用matches(method,clazz)对" + targetClass.getName() + "." + method.getName() + "做动态检查.");
        String clientName = (String) args[0];
        return specialClientList.contains(clientName);
    }
}
