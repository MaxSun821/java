package com.max.test2;

/**
 * ClassName: Employee
 * Package: com.max.test2
 * Description: 员工类
 *
 * @Author MaxSun
 * @Create 2023/12/17 16:59
 * @Version 1.0
 */
public class Employee {
    private String id;
    private String name;
    private int age;
    private double salary;
    private MyDate myDate;

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

    public MyDate getMyDate() {
        return myDate;
    }

    public void setMyDate(MyDate myDate) {
        this.myDate = myDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", myDate=" + myDate +
                '}';
    }
}
