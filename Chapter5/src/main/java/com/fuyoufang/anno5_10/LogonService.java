package com.fuyoufang.anno5_10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class LogonService {
    private LogDao logDao;
    private UserDao userDao;

    @Autowired
    public void init(@Qualifier("userDao")UserDao userDao, LogDao logDao) {
        this.userDao = userDao;
        this.logDao = logDao;
    }

    @Lazy
    @Autowired
    public void setLogDao(LogDao logDao) {
        this.logDao = logDao;
    }

    @Autowired(required = false)
    @Qualifier("userDao")
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
