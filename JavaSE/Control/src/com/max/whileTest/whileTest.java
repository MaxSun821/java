package com.max.whileTest;

/**
 * ClassName: whileTest
 * Package: com.max.whileTest
 * Description: 计算1-100中能被3和5整除的数
 *
 * @Author MaxSun
 * @Create 2024/1/11 19:45
 * @Version 1.0
 */
public class whileTest {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 100) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
                i++;
                continue;
            }
            i++;
        }
    }
}
