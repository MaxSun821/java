package com.max.test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * ClassName: Test10
 * Package: com.max.test
 * Description: 模拟实现线程池
 *
 * @Author MaxSun
 * @Create 2024/2/20 20:20
 * @Version 1.0
 */

class ThreadPool {
    private BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();

    public void submit(Runnable runnable) throws InterruptedException {
        queue.put(runnable);
    }

    public ThreadPool(int n) {
        // 创建n个线程
        for (int i = 0; i < n; i++) {
            Thread t = new Thread(() -> {
                try {
                    while (true) {
                        queue.take().run();
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            t.start();
        }
    }
}

public class Test10 {
    public static void main(String[] args) {
        ThreadPool threadPool = new ThreadPool(10);
        for (int i = 0; i < 100; i++) {
            int num = i;
            try {
                threadPool.submit(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("hello" + num);
                    }
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
