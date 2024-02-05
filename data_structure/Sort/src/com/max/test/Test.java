package com.max.test;

import com.max.domain.Sort;

import java.util.Arrays;
import java.util.Random;

/**
 * ClassName: Test
 * Package: com.max.test
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/2/3 11:15
 * @Version 1.0
 */
public class Test {
    public static void testInsertSort(int[] arr) {
        arr = Arrays.copyOf(arr, arr.length);
        long startTime = System.currentTimeMillis();
        Sort.insertSort(arr);
        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);

    }
    public static void testShellSort(int[] arr) {
        arr = Arrays.copyOf(arr, arr.length);

        long startTime = System.currentTimeMillis();
        Sort.shellSort(arr);
        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);
    }

    public static void testSelectSort(int[] arr) {
        arr = Arrays.copyOf(arr, arr.length);

        long startTime = System.currentTimeMillis();
        Sort.selectSort(arr);
        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);
    }
    public static void testHeapSort(int[] arr) {
        arr = Arrays.copyOf(arr, arr.length);

        long startTime = System.currentTimeMillis();
        Sort.heapSort(arr);
        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);
    }


    public static void main(String[] args) {
        int[] arr = {15,7,2,9,11,24,57,23,91,45};
        Sort.quickSort2(arr);
        System.out.println(Arrays.toString(arr));


//        int[] arr = new int[1000000];
//        Random r = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            int val = r.nextInt(1000000);
//            arr[i] = val;
//        }
//        //testInsertSort(arr);
//        testShellSort(arr);
//        //testSelectSort(arr);
//        testHeapSort(arr);

    }
}
