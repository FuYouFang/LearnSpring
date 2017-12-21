package com.fuyoufang.fb5_9;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;

public class CarFactoryBean implements FactoryBean<Car> {

    private String carInfo;

    public String getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    @Nullable
    @Override
    public Car getObject() throws Exception {
        Car car = new Car();
        String[] infos = carInfo.split(",");
        car.setBrand(infos[0]);
        car.setMaxSpeed(Integer.parseInt(infos[1]));
        car.setPrice(Double.parseDouble(infos[2]));
        return car;
    }

    @Nullable
    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }
}
