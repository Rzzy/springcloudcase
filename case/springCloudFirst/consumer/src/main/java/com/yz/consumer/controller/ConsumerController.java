package com.yz.consumer.controller;

import com.yz.consumer.domain.User;
import com.yz.consumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> consumer(@RequestParam("ids") List<Long> ids){
        return this.userService.queryUserByIds(ids);
    }
}
