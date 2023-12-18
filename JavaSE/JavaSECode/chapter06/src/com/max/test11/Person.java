package com.max.test11;

/**
 * ClassName: Person
 * Package: com.max.test11
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/18 20:36
 * @Version 1.0
 */
public class Person {
    private int age;

    public Person() {
    }

    public Person(int age) {
        if(age < 0 || age > 130) {
            System.out.println("年龄超出范围");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 130) {
            System.out.println("年龄超出范围");
            return;
        }
        this.age = age;
    }
}
