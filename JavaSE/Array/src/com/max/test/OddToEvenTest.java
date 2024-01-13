package com.max.test;

import java.util.Arrays;

/**
 * ClassName: OddToEvenTest
 * Package: com.max.test
 * Description: 调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
 *
 * 如数组：[1,2,3,4,5,6]
 *
 * 调整后可能是：[1, 5, 3, 4, 2, 6]
 *
 * @Author MaxSun
 * @Create 2024/1/13 11:08
 * @Version 1.0
 */
public class OddToEvenTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        oddToEven(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void oddToEven(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while(left < right) {
            while(left < right && arr[left] % 2 != 0) {
                left++;
            }
            while(left < right && arr[right] % 2 == 0) {
                right--;
            }
            if(left < right) {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
    }
}
