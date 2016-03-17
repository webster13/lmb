package com.learn.lmb.service.impl;

import com.learn.lmb.entity.Car;
import com.learn.lmb.entity.User;
import com.learn.lmb.mapper.CarMapper;
import com.learn.lmb.mapper.UserMapper;
import com.learn.lmb.service.CarService;
import com.learn.lmb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("carService")
public class CarServiceImpl implements CarService {

    @Autowired
    CarMapper carMapper;


    @Override
    public Car findById(int id) {
        return carMapper.findById(id);
    }
}
