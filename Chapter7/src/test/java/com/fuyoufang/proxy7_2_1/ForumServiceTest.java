package com.fuyoufang.proxy7_2_1;

import org.testng.annotations.Test;

public class ForumServiceTest {
    @Test
    public void proxy() {
        // 1. 业务类正常编码的测试
         ForumService forumService = new ForumServiceImpl();
         forumService.removeForum(10);
         forumService.removeTopic(1012);

    }
}
