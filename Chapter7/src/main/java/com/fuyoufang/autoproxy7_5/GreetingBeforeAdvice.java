package com.fuyoufang.autoproxy7_5;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.lang.Nullable;

import java.lang.reflect.Method;

public class GreetingBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, @Nullable Object target) throws Throwable {
        String clientName = (String)args[0];
        System.out.println(target.getClass().getName()+"."+method.getName());
        System.out.println("How are you！Mr."+clientName+".");
    }
}
