package com.max.test12;

/**
 * ClassName: Customer
 * Package: com.max.test12
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/18 21:10
 * @Version 1.0
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void print() {
        System.out.println("Customer [" + this.lastName + ", " + this.firstName +
                "] has a account: id is " + this.getAccount().getId() +
                ", annualInterestRate is " + this.getAccount().getAnnualInterestRate() +
                "%, balance is " + this.getAccount().getBalance());
    }
}
