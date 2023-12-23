package com.max.test1;

/**
 * ClassName: Employee
 * Package: com.max.test1
 * Description: 员工类
 *
 * @Author MaxSun
 * @Create 2023/12/23 14:33
 * @Version 1.0
 */
public abstract class Employee {
    private String name;
    private int number;
    private MyDate birthday;

    public Employee() {
    }
    public Employee(String name, int number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }
    public abstract double earnings();
    @Override
    public String toString() {
        return "姓名：" + name + ", 序号：" + number + "生日：" + birthday;
    }
}
