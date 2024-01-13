package com.max.test;

import java.util.Arrays;

/**
 * ClassName: MaxCountNum
 * Package: com.max.test
 * Description: 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数
 * 大于 ⌊ n/2 ⌋ 的元素。你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 * @Author MaxSun
 * @Create 2024/1/13 11:27
 * @Version 1.0
 */
public class MaxCountNum {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        int[] arr2 = {2,2,1,1,1,2,2};
        int ret1 = maxCountNum(arr);
        int ret2 = maxCountNum(arr2);
        System.out.println(ret1);
        System.out.println(ret2);
    }
    public static int maxCountNum(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length / 2];
    }
}
