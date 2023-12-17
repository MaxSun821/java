package com.max.test5;

import java.util.Random;

/**
 * ClassName: Test
 * Package: com.max.test5
 * Description: 定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，然后求出所有元素的最大值，最小值，总和，平均值，
 * 并输出出来。
 *
 * @Author MaxSun
 * @Create 2023/12/17 12:04
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * (99 - 10 + 1)) + 10;
        }
        int max = 0;
        int min = arr[0];
        double sum = 0.0;
        double avg = 0.0;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
            if(min > arr[i]) {
                min = arr[i];
            }
            sum += arr[i];
        }
        avg = sum / arr.length;

        System.out.println("最大值：" + max + ",最小值：" + min + ",总和：" + sum + ",平均值：" + avg);
    }
}
