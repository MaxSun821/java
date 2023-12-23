package com.max.test1;

/**
 * ClassName: PayrollSystem
 * Package: com.max.test1
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/23 15:06
 * @Version 1.0
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new SalariedEmployee("Tom", 110, new MyDate(1995,3,8), 3000);
        employees[1] = new HourlyEmployee("Saly", 111, new MyDate(1993,7,3), 32, 8);
        employees[2] = new SalariedEmployee("Rose", 112, new MyDate(1994,12,23), 3000);
        for (int i = 0; i < 3; i++) {
            System.out.println(employees[i].toString());
        }
    }
}
