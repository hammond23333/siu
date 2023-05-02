package com.xjr.cookapp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xjr.cookapp.dao")
public class CookAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CookAppApplication.class, args);
    }

}
