package com.max.test5;

/**
 * ClassName: Circle
 * Package: com.max.test5
 * Description: 圆类
 *
 * @Author MaxSun
 * @Create 2023/12/18 12:45
 * @Version 1.0
 */
public class Circle {
    private double radius; // 半径
    public static final double PI = 3.14; // PI，取3.14

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

    /**
     * 计算圆的面积
     * @param radius 半径
     * @return
     */
    public double area(double radius) {
        return PI * radius * radius;
    }
}
