package com.max.domain;


/**
 * ClassName: MyLinkedList
 * Package: com.max.domain
 * Description: 模拟实现不带头非循环双向链表
 *
 * @Author MaxSun
 * @Create 2024/1/26 21:31
 * @Version 1.0
 */
public class MyLinkedList {
    class ListNode {
        public int val;
        public ListNode prev; // 前驱结点
        public ListNode next; // 后继结点

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode head; // 头结点
    public ListNode last; // 尾结点

    /**
     * 计算链表的长度
     * @return 链表的长度
     */
    public int size() {
        int count = 0;
        ListNode cur = head;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    /**
     * 打印链表
     */
    public void display() {
        ListNode cur = head;
        while(cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    /**
     * 双向链表头插法
     * @param data 插入的数据
     */
    public void addFirst(int data) {
        ListNode node = new ListNode(data);

        if(head == null) {
            // 没有结点的情况下
            head = node;
            last = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    /**
     * 双向链表尾插法
     * @param data 插入的数据
     */
    public void addLast(int data) {
        ListNode node = new ListNode(data);

        if(head == null) {
            head = node;
            last = node;
        } else {
            last.next = node;
            node.prev = last;
            last = node;
        }
    }

    public boolean addIndex(int index, int data) {
        if(index < 0 || index > size()) {
            System.out.println("下标不合法");
            return false;
        }
        if(index == 0) {
            addFirst(data);
            return true;
        }
        if(index == size()) {
            addLast(data);
            return true;
        }

        ListNode node = new ListNode(data);
        ListNode cur = findIndex(index);

        // 修改结点顺序
        node.next = cur;
        node.prev = cur.prev;

        cur.prev.next = node;
        cur.prev = node;
        return true;
    }

    /**
     * 查找要插入的结点位置
     * @param index 插入的结点下标
     * @return 该位置的结点
     */
    private ListNode findIndex(int index) {
        ListNode cur = head;
        while(index != 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }

    /**
     * 查找链表中是否有关键字key
     * @param key 关键字key
     * @return true->含有 false->不含有
     */
    public boolean contains(int key) {
        ListNode cur = head;
        while(cur != null) {
            if(cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public void remove(int key) {
        ListNode cur = head;

        while(cur != null) {
            if(cur.val == key) {
                if(cur == head) {
                    // 删除元素是头结点
                    head = head.next;
                    if(head != null) {
                        // 解决只有一个结点的问题
                        head.prev = null;
                    }
                } else {
                    cur.prev.next = cur.next;
                    if(cur.next == null) {
                        // 删除的元素是尾结点
                        cur.prev.next = null;
                    } else {
                        // 删除的元素是中间结点
                        cur.next.prev = cur.prev;
                    }
                }
                return;
            }
            cur = cur.next;
        }
    }

    public void removeAllKey(int key) {
        ListNode cur = head;

        while(cur != null) {
            if(cur.val == key) {
                if(cur == head) {
                    // 删除元素是头结点
                    head = head.next;
                    if(head != null) {
                        // 解决只有一个结点的问题
                        head.prev = null;
                    }
                } else {
                    cur.prev.next = cur.next;
                    if(cur.next == null) {
                        // 删除的元素是尾结点
                        cur.prev.next = null;
                    } else {
                        // 删除的元素是中间结点
                        cur.next.prev = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }
}
