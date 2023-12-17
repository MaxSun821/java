package com.max.test2;


/**
 * ClassName: Main
 * Package: com.max.test2
 * Description: 测试类
 *
 * @Author MaxSun
 * @Create 2023/12/17 17:01
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("110", "张三", 23, 11000.0);

        Employee e2 = new Employee("111", "李四", 24, 10000.0);

        e1.setMyDate(new MyDate(2000, 11, 7));

        e2.setMyDate(new MyDate(1999, 3, 4));

        System.out.println(e1.toString());
        System.out.println(e2.toString());
    }
}
