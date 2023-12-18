package com.max.test9;

/**
 * ClassName: PassObject
 * Package: com.max.test9
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/18 19:43
 * @Version 1.0
 */
public class PassObject {
    public void printAreas(Circle c, int time) {
        System.out.println("radius\t\t\tArea");
        for (int i = 1; i <= time; i++) {
            c.setRadius(i);
            System.out.println(c.getRadius() + "\t\t\t" + c.findArea());
        }

    }
}
