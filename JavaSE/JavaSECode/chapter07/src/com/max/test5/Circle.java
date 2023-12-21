package com.max.test5;

/**
 * ClassName: Circle
 * Package: com.max.test5
 * Description: 圆类
 *
 * @Author MaxSun
 * @Create 2023/12/21 12:43
 * @Version 1.0
 */
public class Circle extends GeometricObject{
    private double radius;
    public static final double PI = 3.14;

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return PI * radius * radius;
    }
}
