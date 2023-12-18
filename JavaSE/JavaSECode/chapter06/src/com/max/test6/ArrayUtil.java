package com.max.test6;

/**
 * ClassName: ArrayUtil
 * Package: com.max.test6
 * Description: 数组工具类，完成求最大值、最小值、总和、平均值、遍历数组等功能
 *
 * @Author MaxSun
 * @Create 2023/12/18 12:50
 * @Version 1.0
 */
public class ArrayUtil {
    public int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    public int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public double sum(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public double avg(int[] arr) {
        return sum(arr) / arr.length;
    }

    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int[] copy(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    /**
     * 数组逆置
     * @param arr 数组
     */
    public void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }

    /**
     * 快速排序递归部分
     * @param arr 想要排序的数组
     * @param begin 排序开始位置
     * @param end 排序结束位置
     */
    public void sort(int[] arr, int begin, int end) {
        if(begin >= end) {
            return;
        }
        int key = partSort(arr, begin, end);
        sort(arr, begin, key - 1);
        sort(arr, key + 1, end);
    }

    /**
     * 快速排序的排序部分
     * @param arr 想要排序的数组
     * @param begin 排序的开始位置
     * @param end 排序的末尾位置
     * @return
     */
    private int partSort(int[] arr, int begin, int end) {
        int key = begin;
        int left = begin;
        int right = end;

        while(left < right) {
            while(left < right && arr[right] >= arr[key]) {
                right--;
            }
            while(left < right && arr[left] <= arr[key]) {
                left++;
            }
            swap(arr, left, right);
        }
        swap(arr, key, right);
        return left;
    }

    /**
     * 交换两个整数
     * @param arr 想要交换元素所在的数组
     * @param left 下标
     * @param right 下包
     */
    private void swap(int[] arr, int left, int right) {
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }

    public int find(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
