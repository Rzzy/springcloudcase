package com.leyou.demo.userservice.service;

import com.leyou.demo.userservice.domain.User;
import com.leyou.demo.userservice.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User queryById(Long id) {
        return this.userMapper.selectByPrimaryKey(id);
    }
}
