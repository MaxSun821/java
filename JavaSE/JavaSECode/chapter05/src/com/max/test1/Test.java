package com.max.test1;

import java.util.Scanner;

/**
 * ClassName: Test
 * Package: com.max.test1
 * Description: 使用数组输出英文星期几
 *
 * @Author MaxSun
 * @Create 2023/12/17 11:31
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        String[] weekdays = {"", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入星期几：");
        int weekday = sc.nextInt();
        if(weekday < 1 || weekday > 7) {
            System.out.println("输入错误");
        }else {
            System.out.println(weekdays[weekday]);
        }
    }
}
