package com.max.test;

import java.util.Arrays;

/**
 * ClassName: TwoNumSum
 * Package: com.max.test
 * Description: 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 * 示例 1：
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 *
 * @Author MaxSun
 * @Create 2024/1/13 11:20
 * @Version 1.0
 */
public class TwoNumSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] ret = func(nums, 9);
        System.out.println(Arrays.toString(ret));
    }
    public static int[] func(int[] arr, int target) {
        int[] ret = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    ret[0] = i;
                    ret[1] = j;
                    break;
                }
            }
        }
        return ret;
    }
}
