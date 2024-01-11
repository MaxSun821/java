package com.max.forTest;

/**
 * ClassName: NineCount
 * Package: com.max.forTest
 * Description: 1-100中9的个数
 *
 * @Author MaxSun
 * @Create 2024/1/11 20:19
 * @Version 1.0
 */
public class NineCount {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 100; i++) {
            if(i % 10 == 9) {
                count++;
            }
            if(i / 10 == 9) {
                count++;
            }
        }
        System.out.println("1-100中9出现的个数是：" + count);
    }
}
