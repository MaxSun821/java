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

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
