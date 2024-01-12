package com.max.recursion;

/**
 * ClassName: SumTest
 * Package: com.max.recursion
 * Description: 递归求 1 + 2 + 3 + ... + 10
 *
 * @Author MaxSun
 * @Create 2024/1/12 21:12
 * @Version 1.0
 */
public class SumTest {
    public static void main(String[] args) {
        int ret = sum(10);
        System.out.println(ret);
    }
    public static int sum(int n) {
        if(n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
}
