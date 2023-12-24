package com.max.test3;

/**
 * ClassName: InterfaceTest
 * Package: com.max.test3
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/24 13:13
 * @Version 1.0
 */
public class InterfaceTest {
    public static void main(String[] args) {
        CamparableCircle c1 = new CamparableCircle(2);
        CamparableCircle c2 = new CamparableCircle(1);

        System.out.println(c1.compareTo(c2));

    }
}
