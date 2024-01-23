package com.max.domain;

import com.max.exception.IndexOutOfException;

import java.util.Arrays;

/**
 * ClassName: MyArrayList
 * Package: com.max.domain
 * Description: 简单实现顺序表
 *
 * @Author MaxSun
 * @Create 2024/1/23 12:18
 * @Version 1.0
 */
public class MyArrayList {
    public int[] elem;
    public int usedSize;

    // 默认容量
    private static final int DEFAULT_SIZE = 10;

    public MyArrayList() {
        this.elem = new int[DEFAULT_SIZE];
    }

    /**
     * 打印顺序表
     */
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println(); // 换行
    }

    /**
     * 新增元素，默认在末尾新增
     * @param data 增加的元素
     */
    public void add(int data) {
        // 新增之前需要检查数组容量是否已满
        // 若满需要扩容
        if(isFull()) {
            resize();
        }
        this.elem[this.usedSize++] = data;
    }

    /**
     * 判断数组是否已满
     * @return true->满，false->未满
     */
    public boolean isFull() {
        return this.usedSize == this.elem.length;
    }

    /**
     * 数组扩容
     */
    private void resize() {
        // 扩容二倍
        this.elem = Arrays.copyOf(this.elem, this.elem.length * 2);
    }

    /**
     * 在指定位置新增数据
     * @param pos 指定位置
     * @param data 新增的数据
     */
    public void add(int pos, int data) {
        // 需要先判断pos是否合法
        checkIndexInAdd(pos);
        // 判断需不需要扩容
        if(isFull()) {
            resize();
        }

        if(pos == this.usedSize) {
            add(data);
            return;
        }

        // 向后移动数据
        for(int i = this.usedSize - 1; i >= pos; i--) {
            this.elem[i + 1] = this.elem[i];
        }

        this.elem[pos] = data;
        this.usedSize++;
    }

    private void checkIndexInAdd(int index) {
        if(index < 0 || index > this.usedSize) {
            throw new IndexOutOfException("下标不合法");
        }
    }

    /**
     * 判断是否包含某个元素
     * @param toFind 搜索的元素
     * @return true->包含，false->不包含
     */
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    /**
     * 查找某个元素特定的位置
     * @param toFind 该元素
     * @return 下标，-1为没找到该元素
     */
    public int indexOf(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 获取pos位置的元素
     * @param pos 指定位置
     * @return 该元素
     */
    public int get(int pos) {
        // 判断pos是否合法
        checkIndexInGet(pos);

        return this.elem[pos];
    }

    private void checkIndexInGet(int index) {
        if(index < 0 || index >= this.usedSize) {
            throw new IndexOutOfException("下标不合法");
        }
    }

    /**
     * 给pos位置的元素设置为value
     *
     * @param pos 指定位置
     * @param value 设定值
     */
    public void set(int pos, int value) {
        checkIndexInAdd(pos);

        this.elem[pos] = value;
    }

    /**
     * 删除第一次出现的关键字key
     * @param key 关键字
     * @return 是否删除成功
     */
    public boolean remove(int key) {
        if(isEmpty()) {
            return false;
        }
        // 找到key下标
        int index = indexOf(key);

        if(index == -1) {
            return false;
        }
        for(int i = index; i < this.usedSize - 1; i++) {
            this.elem[i] = this.elem[i + 1];
        }
        this.usedSize--;
        return true;
    }

    /**
     * 判断顺序表是否为空
     * @return true->空，false->非空
     */
    private boolean isEmpty() {
        return this.usedSize == 0;
    }

    /**
     * 获取顺序表长度
     * @return 返回长度
     */
    public int size() {
        return this.usedSize;
    }

    /**
     * 清空顺序表
     */
    public void clear() {
        this.usedSize = 0;
    }
}
