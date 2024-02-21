package com.max.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * ClassName: Test12
 * Package: com.max.test
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/2/21 20:35
 * @Version 1.0
 */
public class Test12 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for (int i = 1; i <= 1000; i++) {
                    sum += i;
                }
                return sum;
            }
        };

        FutureTask<Integer> futureTask = new FutureTask<>(callable);

        Thread t = new Thread(futureTask);

        t.start();

        System.out.println(futureTask.get());
    }
}
