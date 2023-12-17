package com.max.test12;

/**
 * ClassName: Test
 * Package: com.max.test12
 * Description: 冒泡排序
 *
 * @Author MaxSun
 * @Create 2023/12/17 14:04
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {34,54,3,2,65,7,34,5,76,34,67};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j - 1] > arr[j]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
