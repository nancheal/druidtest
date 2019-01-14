package com.example.druidtest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@MapperScan("com.example.druidtest.dao")
@SpringBootApplication
public class DruidtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DruidtestApplication.class, args);
    }

}

