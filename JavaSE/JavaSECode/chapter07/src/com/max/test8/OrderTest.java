package com.max.test8;

/**
 * ClassName: OrderTest
 * Package: com.max.test8
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/23 10:39
 * @Version 1.0
 */
public class OrderTest {
    public static void main(String[] args) {
        Order o1 = new Order(73, "hello");
        Order o2 = new Order(32, "hello");
        System.out.println(o1.equals(o2));
    }
}
