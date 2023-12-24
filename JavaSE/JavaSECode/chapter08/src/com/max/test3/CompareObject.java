package com.max.test3;

/**
 * ClassName: CompareObject
 * Package: com.max.test3
 * Description: 比较接口
 *
 * @Author MaxSun
 * @Create 2023/12/24 12:49
 * @Version 1.0
 */
public interface CompareObject {
    // 若返回值是0，代表相等；若为正数，代表当前对象大；负数代表当前对象小。
    public int compareTo(Object o);
}
class Circle {
    private double radius;

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
}
class CamparableCircle extends Circle implements CompareObject {
    public CamparableCircle() {
    }

    public CamparableCircle(double radius) {
        super(radius);
    }

    // 若返回值是0，代表相等；若为正数，代表当前对象大；负数代表当前对象小。
    @Override
    public int compareTo(Object o) {
        if(getRadius() == ((Circle)o).getRadius()) {
            return 0;
        } else if(getRadius() < ((Circle)o).getRadius()) {
            return -1;
        }
        return 1;
    }
}
