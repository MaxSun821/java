package com.max.test5;

import java.util.Scanner;

/**
 * ClassName: UserTest
 * Package: com.max.test5
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/1/1 14:56
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User[] users = new User[]{new User("songhk", "123"),
        new User("Tom", "8888"),
        new User("Jerry", "6666")};

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String name = sc.next();
        System.out.print("请输入密码：");
        String password = sc.next();
        boolean flag = true;

        for (int i = 0; i < users.length; i++) {
            if(name.equals(users[i].getName())) {
                flag = false;
                if(password.equals(users[i].getPassword())) {
                    System.out.println("登录成功，" + users[i].getName());
                } else {
                    System.out.println("密码有误");
                }
                break;
            }
        }
        if(flag) {
            System.out.println("没有该用户");
        }
    }
}
class User {
    private String name;
    private String password;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return name + "-" + password;
    }
}
