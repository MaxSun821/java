package com.max.test2;

/**
 * ClassName: CylinderTest
 * Package: com.max.test2
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/20 12:53
 * @Version 1.0
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(3);
        cylinder.setLength(5);
        System.out.println("圆柱的体积是：" + cylinder.findVolume());
        System.out.println("圆柱的表面积是：" + cylinder.findArea());
    }
}
