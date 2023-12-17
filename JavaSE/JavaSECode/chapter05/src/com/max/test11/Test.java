package com.max.test11;

/**
 * ClassName: Test
 * Package: com.max.test11
 * Description: 线性查找和二分查找
 *
 * @Author MaxSun
 * @Create 2023/12/17 13:56
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        // 顺序查找
        int[] arr1 = new int[]{34,54,3,2,65,7,34,5,76,34,67};
        boolean flag = true;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] == 5) {
                System.out.println("找到了，索引是：" + i);
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.println("找不到");
        }

        // 二分查找
        int[] arr2 = new int[]{2,4,5,8,12,15,19,26,37,49,51,66,89,100};
        boolean flag2 = true;
        int key = 5;
        int left = 0;
        int right = arr2.length - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(arr2[mid] < key) {
                left = mid + 1;
            } else if(arr2[mid] > key) {
                right = mid - 1;
            } else {
                System.out.println("找到了，下标是：" + mid);
                flag2 = false;
                break;
            }
        }
        if(flag2) {
            System.out.println("找不到");
        }
    }
}
