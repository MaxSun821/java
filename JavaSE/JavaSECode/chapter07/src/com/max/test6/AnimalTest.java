package com.max.test6;

/**
 * ClassName: AnimalTest
 * Package: com.max.test6
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/21 12:59
 * @Version 1.0
 */
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest animalTest = new AnimalTest();
        animalTest.adopt(new Dog());
        animalTest.adopt(new Cat());
    }
    public void adopt(Animal a) {
        if(a instanceof Dog) {
            ((Dog)a).eat();
            ((Dog)a).jump();
            ((Dog)a).lookHome();
        } else if(a instanceof Cat) {
            ((Cat)a).eat();
            ((Cat)a).jump();
            ((Cat)a).catchMouse();
        }
    }
}
