package com.max.test7;

/**
 * ClassName: Exer1
 * Package: com.max.test7
 * Description: 方法重载
 *
 * @Author MaxSun
 * @Create 2023/12/18 13:12
 * @Version 1.0
 */
public class Exer1 {
    public void mOL(int a) {
        System.out.println("平方是：" + (a*a));
    }
    public void mOL(int a, int b) {
        System.out.println("乘积是：" + (a*b));
    }
    public void mOL(String str) {
        System.out.println(str);
    }
}
