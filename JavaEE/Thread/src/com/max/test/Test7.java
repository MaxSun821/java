package com.max.test;

/**
 * ClassName: Test7
 * Package: com.max.test
 * Description: 线程状态
 *
 * @Author MaxSun
 * @Create 2024/2/18 13:54
 * @Version 1.0
 */
public class Test7 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println("hello t");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hello t2");
        });

        System.out.println(t.getState());

        t.start();
        t2.start();
        System.out.println(t.getState());

        //Thread.sleep(1000);
        //System.out.println(t.getState());
        System.out.println(t2.getState());
    }
}
