package com.max.recursion;

/**
 * ClassName: FibTest
 * Package: com.max.recursion
 * Description: 递归求斐波那契数列的第 N 项
 *
 * @Author MaxSun
 * @Create 2024/1/12 21:18
 * @Version 1.0
 */
public class FibTest {
    public static void main(String[] args) {
        System.out.println(fib(10));
    }
    public static int fib(int n) {
        if(n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
