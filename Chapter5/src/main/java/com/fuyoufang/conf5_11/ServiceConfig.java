package com.fuyoufang.conf5_11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    private DaoConfig daoConfig;


    @Bean
    public LogonService logonService() {
        LogonService logonService = new LogonService();
        System.out.println(daoConfig.logDao() == daoConfig.logDao());
        logonService.setLogDao(daoConfig.logDao());
        logonService.setUserDao(daoConfig.userDao());
        return logonService;
    }

    public DaoConfig getDaoConfig() {
        return daoConfig;
    }

    @Autowired
    public void setDaoConfig(DaoConfig daoConfig) {
        this.daoConfig = daoConfig;
    }
}
