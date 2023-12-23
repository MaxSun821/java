package com.max.test1;

/**
 * ClassName: HourlyEmployee
 * Package: com.max.test1
 * Description: 小时工类
 *
 * @Author MaxSun
 * @Create 2023/12/23 15:04
 * @Version 1.0
 */
public class HourlyEmployee extends Employee{
    private double wage;
    private double hour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, int number, MyDate birthday, double wage, double hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }


    @Override
    public double earnings() {
        return wage * hour;
    }
    @Override
    public String toString() {
        return "HourlyEmployee{name=" + getName() +
                ",number=" + getNumber() +
                "birthday=" + getBirthday() +
                '}';
    }
}
