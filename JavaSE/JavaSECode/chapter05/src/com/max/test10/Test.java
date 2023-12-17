package com.max.test10;

/**
 * ClassName: Test
 * Package: com.max.test10
 * Description: 数组的缩容
 *
 * @Author MaxSun
 * @Create 2023/12/17 13:51
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] arr2 = new int[arr.length - 1];

        for (int i = 0; i < arr2.length; i++) {
            if(i >= 4) {
                arr2[i] = arr[i + 1];
            } else {
                arr2[i] = arr[i];
            }

        }
        arr = arr2;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
