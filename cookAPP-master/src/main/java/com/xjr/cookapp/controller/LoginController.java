package com.xjr.cookapp.controller;

import com.xjr.cookapp.domain.ResponseResult;
import com.xjr.cookapp.domain.User;
import com.xjr.cookapp.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class LoginController {

    @Qualifier("loginServiceImpl")
    @Autowired
    LoginService loginService;

    @PostMapping("/user/login")
    public ResponseResult login(@RequestBody User user){

        return loginService.login(user);
    }

}
