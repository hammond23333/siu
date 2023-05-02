package com.xjr.cookapp.service;

import com.xjr.cookapp.domain.ResponseResult;
import com.xjr.cookapp.domain.User;
import org.springframework.stereotype.Service;

@Service("userService")
public interface LoginService {
    public ResponseResult login(User user);
}
