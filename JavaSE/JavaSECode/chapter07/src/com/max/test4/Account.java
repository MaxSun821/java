package com.max.test4;

/**
 * ClassName: Account
 * Package: com.max.test4
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/21 12:16
 * @Version 1.0
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    /**
     * 计算月利率方法
     * @return 返回月利率
     */
    public double getMonthlyinterest() {
        return annualInterestRate / 12;
    }

    /**
     * 取款方法
     * 取款金额大于账户金额取款失败
     * @param amount 取款金额
     */
    public void withdraw(double amount) {
        if(balance < amount) {
            System.out.println("余额不足，取款失败");
            return;
        }
        balance -= amount;
    }

    /**
     * 存款方法
     * @param amount 存款金额
     */
    public void deposit(double amount) {
        balance += amount;
    }
}
