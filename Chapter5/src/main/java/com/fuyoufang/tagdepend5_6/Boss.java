package com.fuyoufang.tagdepend5_6;

public class Boss {
    private String carId;

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "carId='" + carId + '\'' +
                '}';
    }
}
