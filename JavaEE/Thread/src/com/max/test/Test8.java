package com.max.test;

/**
 * ClassName: Test8
 * Package: com.max.test
 * Description: 模拟实现阻塞队列
 *
 * @Author MaxSun
 * @Create 2024/2/19 12:49
 * @Version 1.0
 */

class MyBlockingQueue {
    volatile private int[] arr;
    volatile private int head; // 头下标
    volatile private int tail; // 尾下标
    volatile private int size; // 元素个数


    public MyBlockingQueue() {
        arr = new int[1000];
    }

    synchronized public void put(int val) throws InterruptedException {
        while(size == arr.length) {
            // 数组已满，等待其他线程取元素
            this.wait();
        }

        arr[tail] = val; // 放元素
        tail++;
        if(tail == arr.length) {
            tail = 0;
        }
        size++;
        this.notify();
    }

    synchronized public int take() throws InterruptedException {
        while(size == 0) {
            // 数组已空，等待其他线程放入
            this.wait();
        }
        int value = arr[head];
        head++;
        if(head == arr.length) {
            head = 0;
        }
        size--;
        this.notify();
        return value;
    }
}

public class Test8 {
    public static void main(String[] args) {
        MyBlockingQueue myBlockingQueue = new MyBlockingQueue();
        // 消费者
        Thread t1 = new Thread(() -> {
            while(true) {
                try {
                    int value = myBlockingQueue.take();
                    System.out.println("消费了：" + value);
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        // 生产者
        Thread t2 = new Thread(() -> {
            int value = 0;
            while (true) {
                try {
                    myBlockingQueue.put(value);
                    System.out.println("生产了：" + value);
                    value++;
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
    }
}
