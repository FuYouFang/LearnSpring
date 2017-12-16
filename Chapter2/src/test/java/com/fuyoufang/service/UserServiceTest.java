package com.fuyoufang.service;

import com.fuyoufang.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

import java.util.Date;

import static org.testng.Assert.*;


@ContextConfiguration("classpath*:/smart-context.xml")
public class UserServiceTest extends AbstractTransactionalTestNGSpringContextTests {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    @Test
    public void hasMatchUser() throws Exception {
        boolean b1 = userService.hasMatchUser("admin", "123456");
        assertTrue(b1);
        b1 = userService.hasMatchUser("admin", "111");
        assertFalse(b1);
    }

    @Test
    public void findUserByUserName() throws Exception {
        User user = userService.findUserByUserName("admin");
        assertEquals(user.getUserName(), "admin");

    }

    @Test
    public void testAddLoginLog() {
        User user = userService.findUserByUserName("admin");
        user.setUserId(1);
        user.setUserName("admin");
        user.setLastIp("192.168.12.7");
        user.setLastVisit(new Date());
        userService.loginSuccess(user);
    }
}
