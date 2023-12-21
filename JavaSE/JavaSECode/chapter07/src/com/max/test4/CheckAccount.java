package com.max.test4;

/**
 * ClassName: CheckAccount
 * Package: com.max.test4
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/21 12:29
 * @Version 1.0
 */
public class CheckAccount extends Account{
    private double overdraft;

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    public void withdraw(double amount) {
        if(amount <= getBalance()) {
            setBalance(getBalance() - amount);
        } else {
            double tmp = amount - getBalance();
            if(overdraft >= tmp) {
                setBalance(0);
                overdraft -= tmp;
            } else {
                System.out.println("超过可透支额的限额");
            }
        }
    }
}
