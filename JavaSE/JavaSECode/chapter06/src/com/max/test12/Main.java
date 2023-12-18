package com.max.test12;

/**
 * ClassName: Main
 * Package: com.max.test12
 * Description: 测试类
 *
 * @Author MaxSun
 * @Create 2023/12/18 21:17
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Account account = new Account("1000", 2000, 1.23);
        Customer customer = new Customer("Jane", "Smith");
        customer.setAccount(account);


        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);
        customer.print();


    }
}
