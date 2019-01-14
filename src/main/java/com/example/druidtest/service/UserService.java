package com.example.druidtest.service;

import com.example.druidtest.dao.UserDao;
import com.example.druidtest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User findByName(String name){
        User user =userDao.findByName(name);
        return user;
    }

    public List<User> findAll(){
        List<User> users =userDao.findAll();
        return users;
    }
}