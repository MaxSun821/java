package com.max.test13;

/**
 * ClassName: Test
 * Package: com.max.test13
 * Description: 快速排序
 *
 * @Author MaxSun
 * @Create 2023/12/17 14:12
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        int[] data = { 9, -16, 30, 23, -30, -49, 25, 21, 30 };
        quickSort(data, 0, data.length - 1);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    public static void quickSort(int[] data, int begin, int end) {
        if(begin >= end) {
            return;
        }
        int key = partSort(data, begin, end);
        quickSort(data, begin, key - 1);
        quickSort(data, key + 1, end);
    }
    public static int partSort(int[] data, int begin, int end) {
        int key = begin;
        int left = begin;
        int right = end;

        while(left < right) {
            while(left < right && data[right] >= data[key]) {
                right--;
            }
            while(left < right && data[left] <= data[key]) {
                left++;
            }
            swap(data, left, right);
        }
        swap(data, key, right);
        key = left;
        return key;
    }
    public static void swap(int[] data, int left, int right) {
        int tmp = data[left];
        data[left] = data[right];
        data[right] = tmp;
    }
}
