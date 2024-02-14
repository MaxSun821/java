package com.max.test;

/**
 * ClassName: Test3
 * Package: com.max.test
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/2/14 20:33
 * @Version 1.0
 */
public class Test3 {
    public static void main(String[] args) {
        Thread t = new Thread() {
            @Override
            public void run() {
                while(true) {
                    System.out.println("hello t");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

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
