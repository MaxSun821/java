package com.max.test;

/**
 * ClassName: Test5
 * Package: com.max.test
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/2/14 20:36
 * @Version 1.0
 */
public class Test5 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            while(true) {
                System.out.println("hello t");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t.start();
        while(true) {
            System.out.println("hello main");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
