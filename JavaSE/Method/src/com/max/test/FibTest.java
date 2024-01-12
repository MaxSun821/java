package com.max.test;

/**
 * ClassName: FibTest
 * Package: com.max.test
 * Description: 求斐波那契数第n项，使用迭代
 *
 * @Author MaxSun
 * @Create 2024/1/12 13:01
 * @Version 1.0
 */
public class FibTest {
    public static void main(String[] args) {
        int ret = fib(3);
        System.out.println(ret);
    }
    public static int fib(int n) {
        int a = 1;
        int b = 1;
        int c = 0;
        while(n > 0) {
            a = b;
            b = c;
            c = a + b;
            n--;
        }
        return c;
    }
}
