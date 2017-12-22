package com.fuyoufang.introduce7_3_6;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;
import org.springframework.lang.Nullable;

public class ControllablePerformaceMonitor extends DelegatingIntroductionInterceptor implements Monitorable {
    private ThreadLocal<Boolean> status = new ThreadLocal<>();

    @Override
    public void setMonitorActive(boolean active) {
        status.set(active);
    }

    @Nullable
    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        if (status.get() != null && status.get()) {
            PerformanceMonitor.begin(mi.getClass().getName() + "." + mi.getMethod().getName());
            Object obj = super.invoke(mi);
            PerformanceMonitor.end();
            return obj;
        } else {
            return super.invoke(mi);
        }
    }
}
