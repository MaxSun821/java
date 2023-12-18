package com.max.test10;

/**
 * ClassName: Main
 * Package: com.max.test10
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/18 20:01
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(method1(10));
        System.out.println(method2(10));
    }
    public static int method1(int num) {
        if(num == 20) {
            return 1;
        }
        if(num == 21) {
            return 4;
        }

        return method1(num + 2) - 2 * method1(num + 1);
    }
    public static int method2(int num) {
        if(num == 0) {
            return 1;
        }
        if(num == 1) {
            return 4;
        }
        return 2 * method2(num - 1) - method2(num - 2);
    }
}
