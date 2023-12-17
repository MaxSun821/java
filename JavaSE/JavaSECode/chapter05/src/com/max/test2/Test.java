package com.max.test2;

import java.util.Scanner;

/**
 * ClassName: Test
 * Package: com.max.test2
 * Description: 学生考试等级划分
 *
 * @Author MaxSun
 * @Create 2023/12/17 11:35
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        System.out.print("请输入学生人数：");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] scores = new int[5];
        System.out.println("请输入5个成绩");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }
        int max = scores[0];
        String grade = "";
        for (int i = 0; i < scores.length; i++) {
            if(max < scores[i]) {
                max = scores[i];
            }
            if(scores[i] > 80) {
                grade = "A";
            }else if(scores[i] > 70) {
                grade = "B";
            }else if(scores[i] > 60) {
                grade = "C";
            }else {
                grade = "D";
            }
            System.out.println("student " + i + " score is " + scores[i] + " grade is " + grade);
        }
        System.out.println("最高分是："+ max);
    }
}
