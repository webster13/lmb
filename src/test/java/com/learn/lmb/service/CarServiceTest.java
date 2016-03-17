package com.learn.lmb.service;



import com.learn.lmb.entity.Car;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class CarServiceTest {

    @Autowired
    CarService carService;


    @Test
    public void testFindById() throws Exception {
        Car car= carService.findById(1);
        System.out.println(car.toString());
    }
}