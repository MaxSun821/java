package com.max.test9;

/**
 * ClassName: Test
 * Package: com.max.test9
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/23 10:56
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(4);
        System.out.println(c1.getColor().equals(c2.getColor()));
        System.out.println(c1.equals(c2));
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
