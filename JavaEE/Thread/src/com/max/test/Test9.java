package com.max.test;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * ClassName: Test9
 * Package: com.max.test
 * Description: 定时器模拟实现
 *
 * @Author MaxSun
 * @Create 2024/2/19 13:11
 * @Version 1.0
 */

class MyTask implements Comparable<MyTask>{
    public Runnable runnable;
    public long delay;

    public MyTask(Runnable runnable, long delay) {
        this.runnable = runnable;
        this.delay = delay;
    }

    @Override
    public int compareTo(MyTask o) {
        return (int)(this.delay - o.delay);
    }
}
class MyTimer {
    private PriorityBlockingQueue<MyTask> queue = new PriorityBlockingQueue<>();
    private Object lock = new Object();

    public void schedule(Runnable runnable, long delay) {
        synchronized(lock) {
            long time = System.currentTimeMillis() + delay;
            MyTask myTask = new MyTask(runnable, time);
            queue.put(myTask);
            synchronized (lock) {
                lock.notify();
            }
        }
    }

    public MyTimer() {
        Thread t = new Thread(() -> {
            while(true) {
                try {
                    synchronized (lock) {
                        while(queue.isEmpty()) {
                            lock.wait();
                        }
                        MyTask top = queue.peek();
                        if(top.delay <= System.currentTimeMillis()) {
                            queue.poll();
                            top.runnable.run();
                        } else {
                            lock.wait(top.delay - System.currentTimeMillis());
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
    }
}

public class Test9 {
    public static void main(String[] args) {
//        Timer timer = new Timer();
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println("hello1");
//            }
//        }, 1000);
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println("hello2");
//            }
//        }, 2000);
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println("hello3");
//            }
//        }, 3000);
//        System.out.println("hello0");

        MyTimer myTimer = new MyTimer();
        myTimer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello1");
            }
        }, 1000);

        myTimer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello2");
            }
        }, 2000);

        myTimer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello3");
            }
        }, 3000);

        myTimer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello4");
            }
        }, 4000);

        System.out.println("hello0");

    }
}
