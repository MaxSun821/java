package com.max.test4;

/**
 * ClassName: Main
 * Package: com.max.test4
 * Description: 测试类
 *
 * @Author MaxSun
 * @Create 2023/12/18 12:42
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Exer e = new Exer();
//        e.method1();
//       int area1 = e.method2();
//        System.out.println("面积是：" + area1);
        int area2 = e.method3(3, 10);
        System.out.println("面积是：" + area2);
    }
}
