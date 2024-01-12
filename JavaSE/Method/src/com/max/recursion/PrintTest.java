package com.max.recursion;

/**
 * ClassName: PrintTest
 * Package: com.max.recursion
 * Description: 按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4)    （递归）
 *
 * @Author MaxSun
 * @Create 2024/1/12 21:13
 * @Version 1.0
 */
public class PrintTest {
    public static void main(String[] args) {
        print(1234);
        System.out.println();
    }
    public static void print(int n) {
        if(n < 10) {
            System.out.print(n + " ");
            return;
        }
        print(n / 10);
        System.out.print(n % 10 + " ");
    }
}
