package com.learn.lmb.service.impl;

import com.learn.lmb.entity.User;
import com.learn.lmb.mapper.UserMapper;
import com.learn.lmb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User findById(int id) {
        return userMapper.findById(id);
    }
}
