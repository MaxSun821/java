package com.max.test;

import com.max.domain.MyLinkedList;

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
        /*SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addLast(2);
        singleLinkedList.addLast(4);
        singleLinkedList.addLast(1);
        singleLinkedList.addLast(2);
        singleLinkedList.addLast(6);
        singleLinkedList.addLast(9);
        singleLinkedList.addLast(4);

        singleLinkedList.remove(2);
        singleLinkedList.display();*/

        MyLinkedList list = new MyLinkedList();

        /*list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);*/

        list.addFirst(2);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(2);
        list.addFirst(6);
        list.display();

        list.addIndex(4, 46);
        list.display();

        list.removeAllKey(2);
        list.display();




    }
}
