package com.leyou.demo.userservice;

import com.leyou.demo.userservice.domain.User;
import com.leyou.demo.userservice.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceDemoApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user);
    }

}
