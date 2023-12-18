package com.max.test5;

/**
 * ClassName: Main
 * Package: com.max.test5
 * Description: 测试类
 *
 * @Author MaxSun
 * @Create 2023/12/18 12:48
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        double area = c.area(3.3);
        System.out.println("圆的面积是：" + area);
    }
}
