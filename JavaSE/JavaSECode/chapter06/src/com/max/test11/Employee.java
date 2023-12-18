package com.max.test11;

/**
 * ClassName: Employee
 * Package: com.max.test11
 * Description: 员工类
 *
 * @Author MaxSun
 * @Create 2023/12/18 20:42
 * @Version 1.0
 */
public class Employee {
    private String name;
    private String gender;
    private int age;
    private String tele;

    public Employee() {
    }

    public Employee(String name, String gender, int age, String tele) {
        this.name = name;
        this.gender = gender;
        if(age < 18 || age > 60) {
            System.out.println("年龄超过范围");
        } else {
            this.age = age;
        }
        if(tele.length() != 11 && tele.charAt(0) != '1') {
            System.out.println("电话号码不合法");
        } else {
            this.tele = tele;
        }
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
        if(age < 18 || age > 60) {
            System.out.println("年龄超过范围");
            return;
        }
        this.age = age;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        if(tele.length() != 11 && tele.charAt(0) != '1') {
            System.out.println("电话号码不合法");
            return;
        }
        this.tele = tele;
    }

    public String getInfo() {
        return "姓名: " + name +
                ", 性别: " + gender +
                ", 年龄: " + age +
                ", 电话: " + tele;
    }
}
