package com.max.test1;

import com.max.test2.MyDate;

/**
 * ClassName: Employee
 * Package: com.max.test1
 * Description: 员工类
 *
 * @Author MaxSun
 * @Create 2023/12/17 15:33
 * @Version 1.0
 */
public class Employee {
    private String id;
    private String name;
    private int age;
    private double salary;

    public Employee() {
    }

    public Employee(String id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "编号: " + id +
                ", 姓名: " + name +
                ", 年龄: " + age +
                ", 薪资: " + salary;
    }
}
