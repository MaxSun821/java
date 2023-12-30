package com.max.test4;

/**
 * ClassName: Vehicle
 * Package: com.max.test4
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/24 14:15
 * @Version 1.0
 */
public abstract class Vehicle {
    private String brand;
    private String color;

    public Vehicle() {
    }

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract void run();
}
class Bicycle extends Vehicle{

    public Bicycle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("脚踏车在行驶" +
                "");
    }
}
class ElectricVehicle extends Vehicle implements IPower{
    public ElectricVehicle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("电动车在行驶");
    }

    @Override
    public void power() {
        System.out.println("充电");
    }
}
class Car extends Vehicle implements IPower {
    private String carNumber;

    public Car(String brand, String color, String carNumber) {
        super(brand, color);
        this.carNumber = carNumber;
    }

    @Override
    public void power() {
        System.out.println("加油");
    }

    @Override
    public void run() {
        System.out.println("汽车在行驶");
    }
}
