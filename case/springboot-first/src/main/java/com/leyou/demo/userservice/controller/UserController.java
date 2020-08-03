package com.leyou.demo.userservice.controller;

import com.leyou.demo.userservice.domain.User;
import com.leyou.demo.userservice.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/queryUserserById")
    @ResponseBody
    public User queryById(@RequestParam(name = "id",required = true) Long id){
        User user = this.userService.queryById(id);
        System.out.println("===================");
        return user;
    }
}
