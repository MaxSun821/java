package com.max.test;

import com.max.domain.SingleLinkedList;

/**
 * ClassName: Main
 * Package: com.max.test
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/1/24 21:16
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addLast(2);
        singleLinkedList.addLast(4);
        singleLinkedList.addLast(1);
        singleLinkedList.addLast(2);
        singleLinkedList.addLast(6);
        singleLinkedList.addLast(9);
        singleLinkedList.addLast(4);

        singleLinkedList.remove(2);
        singleLinkedList.display();


    }
}
