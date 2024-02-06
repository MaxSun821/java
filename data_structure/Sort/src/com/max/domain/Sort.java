package com.max.domain;

import java.util.Arrays;
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
            adjustDown(arr, 0, end);
            end--;
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

    /**
     * 快速排序
     * @param arr
     */
    public static void quickSort(int[] arr) {
        quick2(arr, 0, arr.length - 1);
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
     * 三数取中优化
     * @param arr
     * @param begin
     * @param end
     */
    private static void quick2(int[] arr, int begin, int end) {
        if(begin >= end) {
            return;
        }
        int mid = getMid(arr, begin, end);
        swap(arr, mid, begin);
        int ret = getIndexHole(arr, begin, end);
        quick2(arr, begin, ret - 1);
        quick2(arr, ret + 1, end);
    }

    private static int getMid(int[] arr, int left, int right) {
        int mid = (left + right) / 2;
        if(arr[left] < arr[right]) {
            if(arr[mid] < arr[left]) {
                return left;
            } else if(arr[mid] > arr[right]) {
                return right;
            } else {
                return mid;
            }
        } else {
            if(arr[mid] < arr[right]) {
                return right;
            } else if(arr[mid] > arr[left]) {
                return left;
            } else {
                return mid;
            }
        }
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

    /**
     * 冒泡排序
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j + 1] < arr[j]) {
                    swap(arr, j, j + 1);
                    flag = false;
                }
            }
            if(flag) {
                break;
            }
        }
    }

    public static void mergeSort(int[] arr) {
        mergeSortChild(arr, 0, arr.length - 1);
    }
    public static void mergeSortChild(int[] arr, int begin, int end) {
        if(end <= begin) {
            return;
        }
        int mid = (begin + end) / 2;
        // 递归
        mergeSortChild(arr, begin, mid);
        mergeSortChild(arr, mid + 1, end);

        // 合并
        merge(arr, begin, end, mid);

    }

    private static void merge(int[] arr, int begin, int end, int mid) {
        int[] newArr = new int[end - begin + 1];
        int start1 = begin;
        int start2 = mid + 1;
        int k = 0;
        while(start1 <= mid && start2 <= end) {
            if(arr[start1] < arr[start2]) {
                newArr[k++] = arr[start1++];
            } else {
                newArr[k++] = arr[start2++];
            }
        }
        while(start1 <= mid) {
            newArr[k++] = arr[start1++];
        }
        while(start2 <= end) {
            newArr[k++] = arr[start2++];
        }

        for (int i = 0; i < newArr.length; i++) {
            // 赋值回去
            arr[i + begin] = newArr[i];
        }

    }

}
