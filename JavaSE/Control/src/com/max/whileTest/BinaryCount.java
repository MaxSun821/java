package com.max.whileTest;

import java.util.Scanner;

/**
 * ClassName: BinaryCount
 * Package: com.max.whileTest
 * Description: 一个整数二进制中有多少个1
 *
 * @Author MaxSun
 * @Create 2024/1/11 20:25
 * @Version 1.0
 */
public class BinaryCount {
    public static void main(String[] args) {
        int i = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(i < 32) {
            if((num & (1 << i)) != 0) {
                count++;
            }
            i++;
        }
        System.out.println(num + "二进制中有" + count + "个1");
    }
}
