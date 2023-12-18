package com.max.test9;

/**
 * ClassName: Circle
 * Package: com.max.test9
 * Description: 圆类
 *
 * @Author MaxSun
 * @Create 2023/12/18 19:41
 * @Version 1.0
 */
public class Circle {
    private double radius; // 半径
    public final static double PI = 3.14;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
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
