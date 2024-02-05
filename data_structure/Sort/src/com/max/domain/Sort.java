package com.max.domain;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ClassName: Sort
 * Package: com.max.domain
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/2/3 11:11
 * @Version 1.0
 */
public class Sort {
    /**
     * 直接插入排序
     * @param arr 要排序的数组
     */
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if(tmp < arr[j]) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = tmp;
        }
    }

    /**
     * 希尔排序
     * @param arr
     */
    public static void shellSort(int[] arr) {
        int gap = arr.length;
        while(gap > 1) {
            shell(arr, gap);
            gap /= 2;
        }
        shell(arr, 1);

    }
    public static void shell(int[] arr, int gap) {
        for (int i = gap; i < arr.length; i++) {
            int tmp = arr[i];
            int j = i - gap;
            for (; j >= 0; j-=gap) {
                if(tmp < arr[j]) {
                    arr[j + gap] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + gap] = tmp;
        }
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }
    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    /**
     * 堆排序
     * @param arr
     */
    public static void heapSort(int[] arr) {
        createHeap(arr); // 建堆
        int end = arr.length - 1;
        while(end > 0) {
            swap(arr, 0, end);
            end--;
            adjustDown(arr, 0, end);
        }
    }

    private static void createHeap(int[] arr) {
        for (int i = (arr.length - 1 - 1) / 2; i >= 0; i--) {
            adjustDown(arr, i, arr.length);
        }
    }
    private static void adjustDown(int[] arr, int parent, int len) {
        int child = 2 * parent + 1;
        while(child < len) {
            if(child + 1 < len && arr[child + 1] > arr[child]) {
                child++;
            }
            if(arr[child] > arr[parent]) {
                swap(arr, child, parent);
                parent = child;
                child = 2 * parent + 1;
            } else {
                break;
            }
        }
    }

    public static void quickSort(int[] arr) {
        quick(arr, 0, arr.length - 1);
    }
    private static void quick(int[] arr, int begin, int end) {
        if(end <= begin) {
            return;
        }

        int ret = getIndexHoare(arr, begin, end);
        //int ret = getIndexHole(arr, begin, end);


        quick(arr, begin, ret - 1);
        quick(arr, ret + 1, end);
    }

    /**
     * hoare法快排
     * @param arr
     * @param left 区间左下标
     * @param right 区间右下标
     * @return 返回基准位下标
     */
    private static int getIndexHoare(int[] arr, int left, int right) {
        int tmp = arr[left];
        int i = left;
        while(left < right) {
            while(left < right && arr[right] >= tmp) {
                right--;
            }
            while(left < right && arr[left] <= tmp) {
                left++;
            }
            swap(arr, left, right);
        }
        swap(arr, i, left);
        return left;
    }

    private static int getIndexHole(int[] arr, int left, int right) {
        int tmp = arr[left];
        while(left < right) {
            while(left < right && arr[right] >= tmp) {
                right--;
            }
            arr[left] = arr[right];
            while(left < right && arr[left] <= tmp) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = tmp;
        return left;
    }

    public static void quickSort2(int[] arr) {
        Deque<Integer> stack = new LinkedList<>();
        int left = 0;
        int right = arr.length - 1;
        stack.push(left);
        stack.push(right);
        while(!stack.isEmpty()) {
            right = stack.pop();
            left = stack.pop();
            int ret = getIndexHole(arr, left, right);
            if(ret > left + 1) {
                stack.push(left);
                stack.push(ret - 1);
            }
            if(ret < right - 1) {
                stack.push(ret + 1);
                stack.push(right);
            }
        }
    }
}
