package com.max.test9;

/**
 * ClassName: Test
 * Package: com.max.test9
 * Description: 数组扩容
 *
 * @Author MaxSun
 * @Create 2023/12/17 12:32
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr2 = new int[arr.length * 2];
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        arr2[i] = 10;
        arr2[i + 1] = 20;
        arr2[i + 2] = 30;
        arr = arr2;
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }
}
