package com.learn.lmb.service;

import com.learn.lmb.entity.User;
import com.learn.lmb.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * ToDo...
 * Created by Vince on 2016/3/17.
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class UserServiceTest {


    @Autowired
    UserService userService;

    @Test
    public void testFindById() throws Exception {
        User user = userService.findById(1);
        System.out.println(user.toString());
    }
}