package com.fuyoufang.dao;

import com.fuyoufang.domain.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginLogDao {
    private JdbcTemplate jdbcTemplate;

    //保存登陆日志SQL
    private final static String INSERT_LOGIN_LOG_SQL= "INSERT INTO t_login_log(user_id,ip,login_datetime) VALUES(?,?,?)";

    public void insertLoginLog(LoginLog loginLog) {
        Object[] args = {
                loginLog.getUserId(),
                loginLog.getIp(),
                loginLog.getLoginDate()
        };

        try {
            int result = jdbcTemplate.update(INSERT_LOGIN_LOG_SQL, args);
            System.out.println("结果：" + result);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
