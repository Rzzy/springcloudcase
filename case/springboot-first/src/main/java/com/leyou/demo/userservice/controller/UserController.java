package com.leyou.demo.userservice.controller;

import com.leyou.demo.userservice.domain.User;
import com.leyou.demo.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/#{id}")
    public User queryById(@PathVariable("id") Long id){
        User user = this.userService.queryById(id);
        return user;
    }
}
