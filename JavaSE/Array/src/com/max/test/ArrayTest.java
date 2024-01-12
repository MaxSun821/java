package com.max.test;

/**
 * ClassName: ArrayTest
 * Package: com.max.test
 * Description: 创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
 *
 * @Author MaxSun
 * @Create 2024/1/12 21:32
 * @Version 1.0
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
