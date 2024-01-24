package com.max.domain;

import com.max.exception.IndexOutOfException;

/**
 * ClassName: MySingleList
 * Package: com.max.domain
 * Description: 单向不带头非循环链表模拟实现
 *
 * @Author MaxSun
 * @Create 2024/1/24 21:09
 * @Version 1.0
 */
public class SingleLinkedList {
    class ListNode {
        public int val; // 数据
        public ListNode next; // 指向下一个结点

        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode head; // 头结点

    /**
     * 头插法
     * @param data 插入的数据
     */
    public void addFirst(int data) {
        // 创建新节点
        ListNode node = new ListNode(data);

        node.next = head;
        head = node;
    }

    /**
     * 尾插法
     * @param data 插入的数据
     */
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if(head == null) { // 没有结点的情况
            head = node;
            return;
        }

        // 找尾部
        ListNode cur = head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    public boolean addIndex(int index, int data) {
        // 判断下标是否合法
        checkIndex(index);

        if(index == 0) {
            addFirst(data); // 头插法
            return true;
        }

        if(index == size()) {
            addLast(data); // 尾插法
            return true;
        }

        ListNode node = new ListNode(data);
        ListNode prev = findPrevNode(index);

        node.next = prev.next;
        prev.next = node;
        return true;
    }

    /**
     * 查找插入数据前一个位置结点
     * @param index 插入数据位置
     * @return 前一个节点的地址
     */
    private ListNode findPrevNode(int index) {
        int count = 0;
        ListNode cur = head;
        while(count != index - 1) {
            cur = cur.next;
            count++;
        }
        return cur;
    }

    private void checkIndex(int index) {
        if(index < 0 || index > size()) {
            throw new IndexOutOfException("下标不合法");
        }
    }

    public boolean contains(int key) {
        ListNode cur = head;
        while(cur != null) {
            if(cur.val == key) {
                return true;
            }
        }
        return false;
    }

    /**
     * 删除第一次出现关键字key的结点
     * @param key 要删除的结点数据
     */
    public void remove(int key) {
        if(head == null) {
            return;
        }
        if(head.val == key) {
            head = head.next;
            return;
        }

        ListNode cur = head;
        while(cur.next != null) {
            if(cur.next.val == key) {
                ListNode del = cur.next;
                cur.next = del.next;
                del.next = null;
                return;
            }
            cur = cur.next;
        }

    }



    /**
     * 删除链表中所有关键字key
     * @param key 关键字key
     */
    public void removeAllKey(int key) {
        if(head == null) {
            return;
        }
        ListNode prev = head;
        ListNode cur = head.next;

        while(cur != null) {
            if(cur.val == key) {
                prev.next = cur.next;
            } else {
                prev = cur;
            }
            cur = cur.next;
        }
        if(head.val == key) {
            head = head.next;
        }
    }

    public int size() {
        ListNode cur = head;
        int count = 0; // 计数器
        while(cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }

    /**
     * 打印链表
     */
    public void display() {
        // 创建临时指向
        ListNode cur = head;

        while(cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void clear() {
        head = null;
    }

}
