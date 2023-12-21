package com.max.test5;

/**
 * ClassName: GeometricObject
 * Package: com.max.test5
 * Description: 图形抽象类
 *
 * @Author MaxSun
 * @Create 2023/12/21 12:41
 * @Version 1.0
 */
public abstract class GeometricObject {
    private String color;
    private double weight;

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public abstract double findArea();
}
