package com.max.util;

import java.util.Scanner;

/**
 * ClassName: Uility
 * Package: com.max.util
 * Description: 工具类，返回键盘输入
 *
 * @Author MaxSun
 * @Create 2024/1/17 21:36
 * @Version 1.0
 */
public class Uility {
    private static Scanner sc = new Scanner(System.in);

    public static int getInt() {
        int choice = sc.nextInt();
        return choice;
    }
    public static String getString() {
        String choice = sc.next();
        return choice;
    }
    public static double getDouble() {
        double choice = sc.nextDouble();
        return choice;
    }
    public static void getClose() {
        sc.close();
    }
}
