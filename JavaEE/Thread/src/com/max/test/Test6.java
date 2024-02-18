package com.max.test;

/**
 * ClassName: Test6
 * Package: com.max.test
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/2/18 13:01
 * @Version 1.0
 */
public class Test6 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            while(!Thread.currentThread().isInterrupted()) {
                System.out.println("hello t");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("t线程终止");
        });

        t.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.interrupt();
    }
}
