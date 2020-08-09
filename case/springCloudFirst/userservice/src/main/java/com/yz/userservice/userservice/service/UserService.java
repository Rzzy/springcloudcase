package com.yz.userservice.userservice.service;


import com.yz.userservice.userservice.domain.User;
import com.yz.userservice.userservice.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id) throws InterruptedException {
        // Thread.sleep(new Random().nextInt(4000));
        return this.userMapper.selectByPrimaryKey(id);
    }
}