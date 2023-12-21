package com.max.test4;

/**
 * ClassName: AccountTest
 * Package: com.max.test4
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/21 12:24
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account a = new Account(1122, 20000, 0.045);
        a.withdraw(30000);
        System.out.println("您的账户余额为：" + a.getBalance());
        a.withdraw(2500);
        a.deposit(3000);
        System.out.println("您的账户余额为：" + a.getBalance());
        System.out.println("月利率为：" + a.getMonthlyinterest());

        CheckAccount ca = new CheckAccount(1122, 20000, 0.045, 5000);
        ca.withdraw(5000);
        System.out.println("您的账户余额为：" + ca.getBalance() + "，可透支额：" + ca.getOverdraft());
        ca.withdraw(18000);
        System.out.println("您的账户余额为：" + ca.getBalance() + "，可透支额：" + ca.getOverdraft());
        ca.withdraw(3000);
        System.out.println("您的账户余额为：" + ca.getBalance() + "，可透支额：" + ca.getOverdraft());

    }
}
