package com.max.test;

/**
 * ClassName: MaxNumTest
 * Package: com.max.test
 * Description: 使用方法求两个数的较大值，再求三个数的较大值
 *
 * @Author MaxSun
 * @Create 2024/1/12 12:59
 * @Version 1.0
 */
public class MaxNumTest {
    public static void main(String[] args) {
        int ret = max(3, 6);
        int ret2 = max(4, 7, 1);
        System.out.println(ret);
        System.out.println(ret2);
    }
    public static int max(int a, int b) {
        return a > b ? a : b;
    }
    public static int max(int a, int b, int c) {
        int ret = max(a, b);
        return ret > c ? ret : c;
    }
}
