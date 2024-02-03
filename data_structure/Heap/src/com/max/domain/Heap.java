package com.max.domain;

import java.util.Arrays;

/**
 * ClassName: Heap
 * Package: com.max.domain
 * Description: 堆数据结构
 *
 * @Author MaxSun
 * @Create 2024/2/2 12:32
 * @Version 1.0
 */
public class Heap {
    public int[] elem;
    public int usedSize;

    public Heap() {
        this.elem = new int[10];
    }

    /**
     * 建堆
     */
    public void createHeap(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            elem[i] = arr[i];
            usedSize++;
        }
        for (int i = (usedSize - 1 - 1) / 2; i >= 0; i--) {
            adjustDown(i, usedSize);
        }
    }
    public void adjustDown(int parent, int len) {
        int child = parent * 2 + 1; // 左孩子
        while(child < len) {
            if(child + 1 < len && elem[child + 1] < elem[child]) {
                child++;
            }
            if(elem[child] < elem[parent]) {
                int tmp = elem[child];
                elem[child] = elem[parent];
                elem[parent] = tmp;
                parent = child;
                child = parent * 2 + 1;
            } else {
                break;
            }

        }
    }

    public void adjustUp(int child) {
        int parent = (child - 1) / 2;
        while(parent >= 0) {
            if(elem[child] < elem[parent]) {
                int tmp = elem[child];
                elem[child] = elem[parent];
                elem[parent] = tmp;
                child = parent;
                parent = (child - 1) / 2;
            } else {
                break;
            }
        }
    }

    public void offer(int val) {
        if(isFull()) {
            elem = Arrays.copyOf(elem, 2 * elem.length);
        }
        elem[usedSize++] = val;
        adjustUp(usedSize - 1);
    }

    public boolean isFull() {
        return usedSize == elem.length;
    }

    public void poll() {
       if(isEmpty()) {
           return;
       }
       int tmp = elem[0];
       elem[0] = elem[usedSize - 1];
       elem[usedSize - 1] = tmp;
       usedSize--;

       adjustDown(0, usedSize);
    }
    public boolean isEmpty() {
        return usedSize == 0;
    }
    public int peek() {
        if(isEmpty()) {
            return -1;
        }
        return elem[0];
    }
}
