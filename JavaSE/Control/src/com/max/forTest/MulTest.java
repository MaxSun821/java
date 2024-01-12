package com.max.forTest;

import java.util.Scanner;

/**
 * ClassName: MulTest
 * Package: com.max.forTest
 * Description: 九九乘法表
 *
 * @Author MaxSun
 * @Create 2024/1/12 12:56
 * @Version 1.0
 */
public class MulTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + (i*j) + "\t");
            }
            System.out.println();
        }
    }
}
