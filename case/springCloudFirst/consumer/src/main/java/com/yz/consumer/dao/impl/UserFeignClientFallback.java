package com.yz.consumer.dao.impl;

import com.yz.consumer.dao.UserFeignClient;
import com.yz.consumer.domain.User;
import org.springframework.stereotype.Component;

@Component
public class UserFeignClientFallback implements UserFeignClient {
    @Override
    public User queryUserById(Long id) {
        User user = new User();

        user.setId(id);

        user.setName("用户查询出现异常！");

        return user;
    }
}
