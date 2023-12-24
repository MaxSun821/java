package com.max.test2;

/**
 * ClassName: EatableTest
 * Package: com.max.test2
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/24 11:47
 * @Version 1.0
 */
public class EatableTest {
    public static void main(String[] args) {
        Eatable[] eatables = new Eatable[3];
        eatables[0] = new Chinese();
        eatables[1] = new American();
        eatables[2] = new Indian();
        for (int i = 0; i < eatables.length; i++) {
            eatables[i].eat();
        }
    }
}
