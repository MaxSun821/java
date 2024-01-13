package com.max.test;

import java.util.Arrays;

/**
 * ClassName: ChangeValueTest
 * Package: com.max.test
 * Description: 实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 ,
 * 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
 *
 * @Author MaxSun
 * @Create 2024/1/13 11:06
 * @Version 1.0
 */
public class ChangeValueTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        growth(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void growth(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
    }
}
