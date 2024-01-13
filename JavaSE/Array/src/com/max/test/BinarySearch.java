package com.max.test;

/**
 * ClassName: BinarySearch
 * Package: com.max.test
 * Description: 给定一个有序整型数组, 实现二分查找
 *
 * @Author MaxSun
 * @Create 2024/1/13 11:12
 * @Version 1.0
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int index = binarySearch(arr, 9);
        System.out.println(index);
    }
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;
            if(arr[mid] < key) {
                left = mid + 1;
            } else if(arr[mid] > key) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
