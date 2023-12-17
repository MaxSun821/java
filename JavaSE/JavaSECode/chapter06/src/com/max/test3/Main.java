package com.max.test3;

/**
 * ClassName: Main
 * Package: com.max.test3
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/17 17:26
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("张三", 23, '男');
        Person p2 = new Person("李四", 24, '男');

        p1.study();
        int age1 = p1.showAge();
        System.out.println("张三的年龄是：" + age1);

        p2.addAge(4);
        System.out.println("李四的年龄是：" + p2.showAge());
    }
}
