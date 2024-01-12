package com.max.overload;

/**
 * ClassName: OverloadTest
 * Package: com.max.overload
 * Description: 在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。
 * 并执行代码，求出结果
 *
 * @Author MaxSun
 * @Create 2024/1/12 13:11
 * @Version 1.0
 */
public class OverloadTest {
    public static void main(String[] args) {
        int ret = sum(1, 2);
        double ret2 = sum(3.14, 5.6, 3.78);
        System.out.println(ret);
        System.out.println(ret2);
    }
    public static int sum(int a, int b) {
        return a + b;
    }
    public static double sum(double a, double b, double c) {
        return a + b + c;
    }
}
