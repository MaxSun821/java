package com.max.homework;

/**
 * ClassName: Homework4
 * Package: com.max.homework
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/2/18 09:31
 * @Version 1.0
 */
public class Homework4 {
    public static volatile int count = 0;
    public static Object obj = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronized (obj) {
                    while(count % 3 != 0) {
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.print("A");
                    count++;
                    obj.notifyAll();
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronized (obj) {
                    while(count % 3 != 1) {
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.print("B");
                    count++;
                    obj.notifyAll();
                }
            }
        });
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronized (obj) {
                    while(count % 3 != 2) {
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("C");
                    count++;
                    obj.notifyAll();
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
