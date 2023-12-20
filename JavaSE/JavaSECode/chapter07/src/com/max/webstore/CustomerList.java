package com.max.webstore;

import java.util.Scanner;

/**
 * ClassName: CustomerList
 * Package: com.max.webstore
 * Description: Customer对象的管理模块
 *
 * @Author MaxSun
 * @Create 2023/12/19 12:30
 * @Version 1.0
 */
public class CustomerList {
    private Customer[] customers;
    private int size;

    public CustomerList() {
        customers = new Customer[10]; // 创建对象是new一个储存十个元素的数组
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    /**
     * 添加客户
     */
    public void addCustomer() {
        Customer c = new Customer();
        Scanner sc = new Scanner(System.in);
        System.out.println("----------添加客户----------");
        System.out.print("姓名：");
        c.setName(sc.next());
        System.out.print("性别：");
        c.setGender(sc.next());
        System.out.print("年龄：");
        c.setAge(sc.nextInt());
        System.out.print("电话：");
        c.setTele(sc.next());
        System.out.print("邮箱：");
        c.setEmail(sc.next());
        customers[size++] = c;
        System.out.println("----------添加完成----------");
    }

    /**
     * 打印客户信息
     */
    public void printCustomer() {
        System.out.println("----------客户列表----------");
        System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t\t邮箱");
        for (int i = 0; i < size; i++) {
            System.out.println((i+1) + "\t" + customers[i].getName() + "\t" +
                    customers[i].getGender() + "\t" + customers[i].getAge() + "\t" +
                    customers[i].getTele() + "\t\t\t" + customers[i].getEmail());
        }
        System.out.println("-------- 客户列表完成----------");
    }

    public void updateCustomer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------修改客户----------");
        System.out.print("请选择待修改客户编号(-1退出): ");
        int choice = sc.nextInt();
        if(choice < 1 || choice > size) {
            return;
        }
        Customer c = find(choice);
        System.out.print("姓名(" + c.getName() + "): ");
        sc.nextLine();
        String name = sc.nextLine();
        if(!name.equals("")) {
            c.setName(name);
        }
        System.out.print("性别(" + c.getGender() + "): ");
        String gender = sc.nextLine();
        if(!gender.equals("")) {
            c.setGender(gender);
        }
        System.out.print("年龄(" + c.getAge() + "): ");
        String age = sc.nextLine();
        if(!age.equals("")) {
            try {
                if(Integer.valueOf(age) >= 18 && Integer.valueOf(age) < 60)
                    c.setAge(Integer.valueOf(age));
            } catch (Exception e) {
                System.out.println("输入有误");
            }
        }
        System.out.print("电话(" + c.getTele() + "): ");
        String tele = sc.nextLine();
        if(!tele.equals("")) {
            c.setTele(tele);
        }
        System.out.print("邮箱(" + c.getEmail() + "): ");
        String email = sc.nextLine();
        if(!email.equals("")) {
            c.setEmail(email);
        }
        System.out.println("----------修改完成----------");
    }

    public void delCustomer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------删除客户----------");
        System.out.print("请选择待删除客户编号(-1退出): ");
        int index = sc.nextInt();
        if(index < 1 || index > size) {
            return;
        }
        System.out.print("确认是否删除(Y/N): ");
        String choice = sc.next();
        if(choice.equals("Y")) {
            for (int i = index - 1; i < size - 1; i++) {
                customers[i] = customers[i + 1];
            }
            size--;
            System.out.println("----------删除完成----------");
        }
    }

    public Customer find(int index) {
        return customers[index - 1];
    }
}
