package com.max.test7;

/**
 * ClassName: Main
 * Package: com.max.test7
 * Description: 测试类
 *
 * @Author MaxSun
 * @Create 2023/12/18 13:13
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Exer1 e1 = new Exer1();
        e1.mOL(10);
        e1.mOL(6, 9);
        e1.mOL("我超强");

        Exer2 e2 = new Exer2();
        double max = e2.max(10.3, 23.5,5.2);
        System.out.println(max);
    }
}
