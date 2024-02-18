package com.max.homework;

/**
 * ClassName: Homework5
 * Package: com.max.homework
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/2/18 09:58
 * @Version 1.0
 */
public class Homework5 {

    public static void main(String[] args) {
        Thread t3 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        }, "c");

        Thread t2 = new Thread(() -> {
            try {
                t3.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }, "b");

        Thread t1 = new Thread(() -> {
            try {
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }, "a");

        t1.start();
        t2.start();
        t3.start();

    }
}
