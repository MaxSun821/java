package com.max.recursion;

/**
 * ClassName: NumSumTest
 * Package: com.max.recursion
 * Description: 写一个递归方法，输入一个非负整数，返回组成它的数字之和
 *
 * @Author MaxSun
 * @Create 2024/1/12 21:16
 * @Version 1.0
 */
public class NumSumTest {
    public static void main(String[] args) {
        System.out.println(numSum(1729));
    }
    public static int numSum(int n) {
        if(n < 10) {
            return n;
        }
        return (n % 10) + numSum(n / 10);
    }
}
