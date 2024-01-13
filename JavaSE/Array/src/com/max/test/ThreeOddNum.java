package com.max.test;

/**
 * ClassName: ThreeOddNum
 * Package: com.max.test
 * Description: 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数
 *大于 ⌊ n/2 ⌋ 的元素。你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 * @Author MaxSun
 * @Create 2024/1/13 11:31
 * @Version 1.0
 */
public class ThreeOddNum {
    public static void main(String[] args) {
        int[] arr = {2,6,4,1};
        boolean ret1 = func(arr);
        System.out.println(ret1);
        int[] arr2 = {1,2,34,3,4,5,7,23,12};
        boolean ret2 = func(arr2);
        System.out.println(ret2);
    }
    public static boolean func(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                count++;
                if(count == 3) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }
}
