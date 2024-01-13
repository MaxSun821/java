package com.max.test;

/**
 * ClassName: FindSingle
 * Package: com.max.test
 * Description: 给定一个非空整数数组，除了某个元素只出现一次以外，
 * 其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * @Author MaxSun
 * @Create 2024/1/13 11:24
 * @Version 1.0
 */
public class FindSingle {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3};
        int ret = findSingle(arr);
        System.out.println(ret);
    }
    public static int findSingle(int[] arr) {
        int ret = 0;
        for (int i = 0; i < arr.length; i++) {
            ret ^= arr[i];
        }
        return ret;
    }
}
