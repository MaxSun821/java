package com.max.forTest;

/**
 * ClassName: LeapYear
 * Package: com.max.forTest
 * Description: 1000-2000的闰年
 *
 * @Author MaxSun
 * @Create 2024/1/11 20:21
 * @Version 1.0
 */
public class LeapYear {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1000; i <= 2000; i++) {
            if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
