package com.fuyoufang.anno5_10;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Component("boss")
public class Boss {
    private Car car;

    public Boss() {
        System.out.println("construct..");
    }

    @PostConstruct
    public void init1() {
        System.out.println("init1");
    }

    @PostConstruct
    public void init2() {
        System.out.println("init2");
    }

    @PreDestroy
    public void destroy1() {
        System.out.println("destroy1");
    }

    @PreDestroy
    public void destroy2() {
        System.out.println("destroy2");
    }

    public Car getCar() {
        return car;
    }

    @Resource
    public void setCar(Car car) {
        this.car = car;
    }
}
