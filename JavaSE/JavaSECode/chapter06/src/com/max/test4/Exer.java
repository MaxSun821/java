package com.max.test4;

/**
 * ClassName: Exer
 * Package: com.max.test4
 * Description: 打印*型矩形，并计算面积
 *
 * @Author MaxSun
 * @Create 2023/12/18 12:40
 * @Version 1.0
 */
public class Exer {
    public void method1() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public int method2() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return 8 * 10;
    }
    public int method3(int m, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return m * n;
    }
}
