package com.max.test;

import java.util.Arrays;

/**
 * ClassName: BubbleSortTest
 * Package: com.max.test
 * Description: 给定一个整型数组, 实现冒泡排序(升序排序)
 *
 * @Author MaxSun
 * @Create 2024/1/13 11:16
 * @Version 1.0
 */
public class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr = {1,5,2,9,4,13,7,31,24,66,38,10,19};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // 趟数
            boolean flag = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 一趟冒泡排序
                if(arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flag = false;
                }
            }
            if(flag) {
                break;
            }
        }
    }
}
