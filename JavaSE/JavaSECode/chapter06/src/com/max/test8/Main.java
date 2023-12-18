package com.max.test8;

/**
 * ClassName: Main
 * Package: com.max.test8
 * Description: 可变形参方法
 *
 * @Author MaxSun
 * @Create 2023/12/18 19:34
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.method(".", "hello", "max", "world"));
    }

    public String method(String operator, String ... str) {
        String newStr = "";
        for (int i = 0; i < str.length; i++) {
            if(i == 0) {
                newStr += str[i];
            } else {
                newStr += operator;
                newStr += str[i];
            }
        }
        return newStr;
    }
}
