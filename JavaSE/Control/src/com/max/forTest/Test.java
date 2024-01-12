package com.max.forTest;

/**
 * ClassName: Test
 * Package: com.max.forTest
 * Description: 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
 *
 * @Author MaxSun
 * @Create 2024/1/12 12:47
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        double ret = 0.0;
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                ret -= (1.0 / i);
            }else {
                ret += (1.0 / i);
            }
        }
        System.out.println(ret);
    }
}
