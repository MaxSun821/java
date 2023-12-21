package com.max.test5;

/**
 * ClassName: GeometricTest
 * Package: com.max.test5
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/21 12:47
 * @Version 1.0
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest geometricTest = new GeometricTest();
        GeometricObject g1 = new Circle("绿色", 3.2, 3);
        GeometricObject g2 = new MyRectangle("黄色", 2.7, 4, 5);
        if(geometricTest.equalsArea(g1, g2)) {
            System.out.println("面积相等");
        } else {
            System.out.println("面积不相等");
        }
        geometricTest.displayGeometricObject(g1, g2);
    }
    public boolean equalsArea(GeometricObject g1, GeometricObject g2) {
        if(g1.findArea() == g2.findArea()) {
            return true;
        }
        return false;
    }
    public void displayGeometricObject(GeometricObject g1, GeometricObject g2) {
        System.out.println("面积分别是：" + g1.findArea() + ", " + g2.findArea());
    }
}
