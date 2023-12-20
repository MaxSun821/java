package com.max.webstore;

import java.util.Scanner;

/**
 * ClassName: Main
 * Package: com.max.webstore
 * Description: 测试类
 *
 * @Author MaxSun
 * @Create 2023/12/19 12:21
 * @Version 1.0
 */
public class CustomerView {
    public static void main(String[] args) {
        CustomerList customerList = new CustomerList();
        Scanner sc = new Scanner(System.in);
        while(true) {
            menu();
            System.out.print("            请选择(1-5): ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    customerList.addCustomer();
                    break;
                case 2:
                    customerList.updateCustomer();
                    break;
                case 3:
                    customerList.delCustomer();
                    break;
                case 4:
                    customerList.printCustomer();
                    break;
                case 5:
                    System.out.println("退出程序");
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
            }

        }


    }
    public static void menu() {
        System.out.println("-----------拼电商客户管理系统-------------");
        System.out.println();
        System.out.println("            1 添 加 客 户");
        System.out.println("            2 修 改 客 户");
        System.out.println("            3 删 除 客 户");
        System.out.println("            4 客 户 列 表");
        System.out.println("            5 退       出");
    }
}
