package com.fuyoufang.anno5_10;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Lazy
@Repository
public class LogDao implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("LogDao....");
    }
}
