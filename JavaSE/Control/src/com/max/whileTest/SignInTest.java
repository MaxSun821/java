package com.max.whileTest;

import java.util.Scanner;

/**
 * ClassName: SignInTest
 * Package: com.max.whileTest
 * Description:编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,
 * 密码错误， 可以重新输 入，最多输入三次。三次均错，则提示退出程序
 *
 * @Author MaxSun
 * @Create 2024/1/12 12:51
 * @Version 1.0
 */
public class SignInTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "123456";
        boolean flag = true;
        int count = 0;
        while(count < 3) {
            System.out.print("请输入密码：");
            String tmp = sc.next();
            if(tmp.equals(password)) {
                flag = false;
                System.out.println("登录成功");
            }
            count++;
        }
        if(flag) {
            System.out.println("密码3次错误，退出程序");
        }
    }
}
