package com.max.homework;

import java.util.Random;

/**
 * ClassName: Homework2
 * Package: com.max.homework
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/2/17 14:19
 * @Version 1.0
 */
class SumOperator {
    public long odd;
    public long even;
    public void sumOdd(int n) {
        odd += n;
    }
    public void sumEven(int n) {
        even += n;
    }
    public long result() {
        return odd + even;
    }
}
public class Homework2 {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        int arr[] = new int[1000_0000];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
        }

        SumOperator s = new SumOperator();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i < arr.length; i+=2) {
                s.sumOdd(arr[i]);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < arr.length; i+=2) {
                s.sumEven(arr[i]);
            }
        });
        // 开启线程
        t1.start();
        t2.start();

        // 等待相加结束
        t1.join();
        t2.join();

        s.result();

        long end = System.currentTimeMillis();

        System.out.println("共用时：" + (end - start));

    }
}
