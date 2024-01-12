package com.max.whileTest;

/**
 * ClassName: PrintTest
 * Package: com.max.whileTest
 * Description: 输出一个整数的每一位，如：123的每一位是3，2，1
 *
 * @Author MaxSun
 * @Create 2024/1/12 12:50
 * @Version 1.0
 */
public class PrintTest {
    public static void main(String[] args) {
        int num = 123;
        while(num != 0) {
            System.out.println(num % 10);
            num /= 10;
        }
    }
}
