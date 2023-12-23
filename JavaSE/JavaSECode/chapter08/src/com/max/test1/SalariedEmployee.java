package com.max.test1;

import java.util.Date;

/**
 * ClassName: SalariedEmployee
 * Package: com.max.test1
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/23 14:38
 * @Version 1.0
 */
public class SalariedEmployee extends Employee{
    private double monthlySalary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earnings() {
        Date d = new Date();
        if(d.getMonth() == getBirthday().getMonth()) {
            return monthlySalary + 100;
        }
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{name=" + getName() +
                ",number=" + getNumber() +
                "birthday=" + getBirthday() +
                '}';
    }
}
