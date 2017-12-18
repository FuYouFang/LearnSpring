package com.fuyoufang.context;

import com.fuyoufang.domain.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {

    @Bean(name = "car")
    public Car car() {
        Car car = new Car();
        car.setBrand("奔驰");
        car.setColor("白色");
        car.setMaxSpeed(230);
        return car;
    }
}
