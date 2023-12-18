package com.max.test11;

import java.util.Scanner;

/**
 * ClassName: Main
 * Package: com.max.test11
 * Description: 测试类
 *
 * @Author MaxSun
 * @Create 2023/12/18 20:47
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(true) {
            Employee e = new Employee();
            System.out.print("请输入员工姓名: ");
            e.setName(sc.next());
            System.out.print("请输入员工性别: ");
            e.setGender(sc.next());
            System.out.print("请输入员工年龄: ");
            e.setAge(sc.nextInt());
            System.out.print("请输入员工电话号码: ");
            e.setTele(sc.next());
            employees[count] = e;
            count++;
            System.out.print("请问是否继续输入: ");
            String flag = sc.next();
            if(flag.equals("N")) {
                break;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i].getInfo());
        }

    }
}
