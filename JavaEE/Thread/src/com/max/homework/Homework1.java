package com.max.homework;

/**
 * ClassName: Homework1
 * Package: com.max.homework
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/2/17 11:04
 * @Version 1.0
 */
public class Homework1 {
    public static void main(String[] args) {
        Thread[] t = new Thread[20];
        for (int i = 0; i < t.length; i++) {
            final int n = i;
            t[i] = new Thread(() -> {
                System.out.println(n);
            });
        }
        for (Thread thread : t) {
            thread.start();
        }
        for (Thread thread : t) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("ok");
    }
}
