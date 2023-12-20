package com.max.test3;

/**
 * ClassName: Kids
 * Package: com.max.test1
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/20 12:45
 * @Version 1.0
 */
public class Kids extends ManKind {
    private int yearsOld;

    public Kids() {
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
    public void employeed() {
        super.employeed();
        System.out.println("but Kids should study and no job.");
    }
    public void printAge() {
        System.out.println("年龄：" + yearsOld);
    }
}
