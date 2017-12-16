package com.fuyoufang.reflect;

import com.fuyoufang.domain.Car;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectTest {
    public static Car initByDefaultConst() throws Throwable {

        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("com.fuyoufang.domain.Car");

        Constructor constructor = clazz.getDeclaredConstructor((Class[]) null);
        Car car = (Car) constructor.newInstance();

        Method setBrand = clazz.getMethod("setBrand", String.class);
        setBrand.invoke(car, "红旗");
        Method setColor = clazz.getMethod("setColor", String.class);
        setColor.invoke(car, "red");
        Method setMaxSpeed = clazz.getMethod("setMaxSpeed", int.class);
        setMaxSpeed.invoke(car, 260);

        return car;
    }

    public static void main(String[] args) throws Throwable {
        Car car = ReflectTest.initByDefaultConst();

        System.out.println(car.toString());

        Car car1 = ReflectTest.initByDefaultConst();

        System.out.println(car1.toString());
    }
}
