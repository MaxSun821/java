package com.max.webstore;

/**
 * ClassName: Customer
 * Package: com.max.webstore
 * Description: 客户类
 *
 * @Author MaxSun
 * @Create 2023/12/19 12:21
 * @Version 1.0
 */
public class Customer {
    private String name;
    private String gender;
    private int age;
    private String tele;
    private String email;

    public Customer() {
    }

    public Customer(String name, String gender, int age, String tele, String email) {
        this.name = name;
        this.gender = gender;
        if(age < 0 || age > 130) {
            System.out.println("年龄超出范围");
        } else {
            this.age = age;
        }
        this.tele = tele;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 130) {
            System.out.println("年龄超出范围");
            return;
        }
        this.age = age;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
