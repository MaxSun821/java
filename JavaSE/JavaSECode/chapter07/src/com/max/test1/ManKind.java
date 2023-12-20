package com.max.test1;

/**
 * ClassName: ManKind
 * Package: com.max.test1
 * Description: 人类类
 *
 * @Author MaxSun
 * @Create 2023/12/20 12:43
 * @Version 1.0
 */
public class ManKind {
    private int sex;
    private int salary;

    public ManKind() {
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void manOrWoman() {
        if(sex == 1) {
            System.out.println("man");
        } else if(sex == 0) {
            System.out.println("woman");
        }
    }
    public void employeed() {
        if(salary == 0) {
            System.out.println("no job");
        } else {
            System.out.println("job");
        }
    }
}
