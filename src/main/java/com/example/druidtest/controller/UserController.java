package com.example.druidtest.controller;

import com.example.druidtest.model.User;
import com.example.druidtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/find")
    public User findByName(@RequestParam String name){
        /*因为没写前端页面，这里写了些伪业务代码*/
        User user =userService.findByName(name);
        return user;
    }

    @RequestMapping("/findall")
    public List<User> findAll(){
        List<User> users =userService.findAll();
        return users;
    }
}