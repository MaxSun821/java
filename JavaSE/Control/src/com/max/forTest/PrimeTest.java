package com.max.forTest;

/**
 * ClassName: PrimeTest
 * Package: com.max.forTest
 * Description: 1-100之间的素数
 *
 * @Author MaxSun
 * @Create 2024/1/11 20:14
 * @Version 1.0
 */
public class PrimeTest {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.print(i + " ");
            }
        }

    }
}
