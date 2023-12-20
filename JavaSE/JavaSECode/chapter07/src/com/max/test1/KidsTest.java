package com.max.test1;

/**
 * ClassName: KidsTest
 * Package: com.max.test1
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/20 12:47
 * @Version 1.0
 */
public class KidsTest {
    public static void main(String[] args) {
        Kids someKid = new Kids();
        someKid.setSex(0);
        someKid.setYearsOld(6);
        someKid.setSalary(0);
        someKid.manOrWoman();
        someKid.employeed();
        someKid.printAge();
    }
}
