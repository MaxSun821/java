package com.max.test;

/**
 * ClassName: Test
 * Package: com.max.test
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/2/14 16:10
 * @Version 1.0
 */

class MyThread extends Thread {
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
}

public class Test {
    public static void main(String[] args) {
        Thread t = new MyThread();
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
