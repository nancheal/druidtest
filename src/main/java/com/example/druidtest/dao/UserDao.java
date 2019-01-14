package com.example.druidtest.dao;


import com.example.druidtest.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {

    /*xml方式*/
    User findByName(@Param("name") String name);
    /*注解方式*/
    @Select("select * from users")
    List<User> findAll();
}