package com.max.test7;

/**
 * ClassName: Exer2
 * Package: com.max.test7
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/18 13:15
 * @Version 1.0
 */
public class Exer2 {
    public int max(int a, int b) {
        if(a > b) {
            return a;
        }
        return b;
    }
    public double max(double a, double b) {
        if(a > b) {
            return a;
        }
        return b;
    }
    public double max(double a, double b, double c) {
        if(a > b) {
            if(b > c || a > c) {
                return a;
            }
        } else if(b > a) {
            if(b > c || a > c) {
                return b;
            }
        }
        return c;
    }
}
