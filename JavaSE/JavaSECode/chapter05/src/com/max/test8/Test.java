package com.max.test8;

/**
 * ClassName: Test
 * Package: com.max.test8
 * Description: 翻转数组
 *
 * @Author MaxSun
 * @Create 2023/12/17 12:26
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {34,54,3,2,65,7,34,5,76,34,67};
        int left = 0;
        int right = arr.length - 1;
        while(left < right) {
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
