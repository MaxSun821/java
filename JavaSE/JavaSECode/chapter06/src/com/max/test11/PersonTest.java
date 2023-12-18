package com.max.test11;

/**
 * ClassName: PersonTest
 * Package: com.max.test11
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/18 20:38
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(20);
        System.out.println(p.getAge());
        p.setAge(140);
        System.out.println(p.getAge());
    }
}
