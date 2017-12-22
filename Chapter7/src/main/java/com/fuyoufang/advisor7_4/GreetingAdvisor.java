package com.fuyoufang.advisor7_4;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;
import org.springframework.lang.Nullable;

import java.lang.reflect.Method;

public class GreetingAdvisor extends StaticMethodMatcherPointcutAdvisor {

    @Override
    public boolean matches(Method method, @Nullable Class<?> targetClass) {
        return "greetTo".equals(method.getName());
    }

    @Override
    public ClassFilter getClassFilter() {
        return new ClassFilter(){
            @Override
            public boolean matches(Class<?> clazz) {
                return Waiter.class.isAssignableFrom(clazz);
            }
        };
    }
}
