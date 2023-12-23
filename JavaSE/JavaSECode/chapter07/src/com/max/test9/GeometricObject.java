package com.max.test9;

/**
 * ClassName: GeometricObject
 * Package: com.max.test9
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/23 10:49
 * @Version 1.0
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    protected GeometricObject() {
        color = "white";
        weight = 1.0;
    }

    protected GeometricObject(String color, double weight) {
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
}
