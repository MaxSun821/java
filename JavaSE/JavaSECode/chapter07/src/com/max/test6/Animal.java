package com.max.test6;

/**
 * ClassName: Animal
 * Package: com.max.test6
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/21 12:56
 * @Version 1.0
 */
public class Animal {
    public void eat() {
        System.out.println("动物进食");
    }
    public void jump() {
        System.out.println("动物跳");
    }
}
class Dog extends Animal{
    public void eat() {
        System.out.println("狗吃骨头");
    }
    public void jump() {
        System.out.println("狗急跳墙");
    }
    public void lookHome() {
        System.out.println("狗在看家");
    }
}
class Cat extends Animal{
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void jump() {
        System.out.println("猫跳");
    }
    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
