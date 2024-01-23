package com.max.test;

import com.max.domain.MyArrayList;

/**
 * ClassName: Main
 * Package: com.max.test
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/1/23 12:40
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();

        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(7);
        myArrayList.add(8);
        myArrayList.add(9);
        myArrayList.add(10);

        myArrayList.display();

        myArrayList.add(10, 60);
        myArrayList.display();

        myArrayList.remove(1);
        myArrayList.display();

        System.out.println(myArrayList.indexOf(2));

    }
}
