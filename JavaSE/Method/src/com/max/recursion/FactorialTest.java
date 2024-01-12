package com.max.recursion;

/**
 * ClassName: FactorialTest
 * Package: com.max.recursion
 * Description: 递归求 N 的阶乘
 *
 * @Author MaxSun
 * @Create 2024/1/12 21:10
 * @Version 1.0
 */
public class FactorialTest {
    public static void main(String[] args) {
        int ret = fac(5);
        System.out.println(ret);
    }
    public static int fac(int n) {
        if(n == 1) {
            return 1;
        }
        return n * fac(n - 1);
    }
}
