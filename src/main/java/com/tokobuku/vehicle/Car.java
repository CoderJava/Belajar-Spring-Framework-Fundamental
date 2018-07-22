package com.tokobuku.vehicle;

public class Car implements Vehicle {

    private String brand;
    private String type;
    private String engine;
    private String transmission;
    private String fuel;
    private String motion;

    public Car() {
    }

    public Car(String brand, String type, String engine, String transmission, String fuel) {
        this.brand = brand;
        this.type = type;
        this.engine = engine;
        this.transmission = transmission;
        this.fuel = fuel;
    }

    public String getMotion() {
        return motion;
    }

    public void setMotion(String motion) {
        this.motion = motion;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", engine='" + engine + '\'' +
                ", transmission='" + transmission + '\'' +
                ", fuel='" + fuel + '\'' +
                ", motion='" + motion + '\'' +
                '}';
    }

    @Override
    public void move() {
        System.out.println(motion);
    }
}
