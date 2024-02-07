package com.max.domain;

/**
 * ClassName: HashBucket
 * Package: com.max.domain
 * Description: 哈希桶
 *
 * @Author MaxSun
 * @Create 2024/2/7 19:09
 * @Version 1.0
 */
public class HashBucket {
    class Node {
        public int key;
        public int val;
        public Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    private Node[] arr;
    private static final double LOAD_FACTOR = 0.75;
    private int usedSize;
    public HashBucket() {
        this.arr = new Node[10];
    }

    public void put(int key, int val) {
        int index = key % arr.length;
        if(arr[index] == null) {
            arr[index] = new Node(key, val);
        }
        Node cur = arr[index];
        while(cur.next != null) {
            if(cur.key == key) {
                cur.val = val;
                return;
            }
        }
        Node node = new Node(key, val);
        cur.next = node;
        usedSize++;
        if(calculateLoadFactor() >= LOAD_FACTOR) {
            resize();
        }
    }
    private double calculateLoadFactor() {
        return usedSize * 1.0 / arr.length;
    }
    private void resize() {
        Node[] newArr = new Node[arr.length * 2];
        for (Node node : arr) {
            Node cur = node;
            while(cur != null) {
                Node curNext = cur.next;
                int index = cur.key % newArr.length;
                newArr[index] = cur;
                cur = curNext;
            }
        }
        arr = newArr;
    }
    public int get(int key) {
        int index = key % arr.length;
        Node cur = arr[index];
        while(cur != null) {
            if(cur.key == key) {
                return cur.val;
            }
            cur = cur.next;
        }
        return -1;
    }
}
