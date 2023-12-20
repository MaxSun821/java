package com.max.test2;

/**
 * ClassName: Circle
 * Package: com.max.test2
 * Description: 圆类
 *
 * @Author MaxSun
 * @Create 2023/12/20 12:50
 * @Version 1.0
 */
public class Circle {
    private double radius;
    public static final double PI = 3.14;

    public Circle() {
        radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double findArea() {
        return PI * radius * radius;
    }
}
