package com.max.test9;

/**
 * ClassName: Circle
 * Package: com.max.test9
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/23 10:51
 * @Version 1.0
 */
public class Circle extends GeometricObject{
    private double radius;

    public Circle() {
        super();
    }
    public Circle(double radius) {
        this.radius = radius;
    }

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
    public double findArea() {
        return 3.14 * radius * radius;
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj instanceof Circle) {
            return ((Circle)obj).radius == this.radius;
        }
        return false;
    }
    @Override
    public String toString() {
        return String.valueOf(radius);
    }
}
