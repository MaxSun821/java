package com.max.test12;

/**
 * ClassName: Account
 * Package: com.max.test12
 * Description: 账户类
 *
 * @Author MaxSun
 * @Create 2023/12/18 21:06
 * @Version 1.0
 */
public class Account {
    private String id;
    private double balance;
    private double annualInterestRate;

    public Account() {
    }

    public Account(String id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(int money) {
        if(money > balance) {
            System.out.println("余额不足，取款失败");
            return;
        }
        System.out.println("成功取出：" + money);
        balance -= money;
    }

    public void deposit(int money) {
        balance += money;
        System.out.println("成功存入：" + money);
    }
}
