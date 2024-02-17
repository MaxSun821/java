package com.max.homework;

/**
 * ClassName: Homework3
 * Package: com.max.homework
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/2/17 14:45
 * @Version 1.0
 */
class CountSum {
    public int count = 0;
    public void sum() {
        synchronized(this) {
            count++;
        }
    }
}
public class Homework3 {
    public static void main(String[] args) throws InterruptedException {
        CountSum c = new CountSum();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                c.sum();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                c.sum();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}
