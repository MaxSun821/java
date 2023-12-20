package com.max.test2;

/**
 * ClassName: Cylinder
 * Package: com.max.test2
 * Description: 圆柱类
 *
 * @Author MaxSun
 * @Create 2023/12/20 12:52
 * @Version 1.0
 */
public class Cylinder extends Circle{
    private double length;

    public Cylinder() {
        length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double findArea() {
        return PI * 2 * getRadius() * length;
    }
    public double findVolume() {
        return super.findArea() * length;
    }
}
