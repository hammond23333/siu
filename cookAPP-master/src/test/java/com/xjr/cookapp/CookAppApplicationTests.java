package com.xjr.cookapp;

import com.xjr.cookapp.dao.UserMapper;
import com.xjr.cookapp.domain.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;
import java.util.List;

@SpringBootTest
class CookAppApplicationTests {
    @Autowired
    UserMapper userMapper;
    @Test
    void contextLoads(){

        List<User> users=userMapper.selectList(null);
        System.out.println(users.get(0));
    }
    @Autowired
    PasswordEncoder passwordEncoder;
    @Test
    public void testBcript()
    {
        String ydlclass1=passwordEncoder.encode("ydlclass");
        String ydlclass2=passwordEncoder.encode("ydlclass");
        System.out.println(ydlclass1);
        System.out.println(ydlclass2);

    }



}
