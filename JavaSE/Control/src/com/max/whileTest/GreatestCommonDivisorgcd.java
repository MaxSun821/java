package com.max.whileTest;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.util.Scanner;

/**
 * ClassName: GreatestCommonDivisorgcd
 * Package: com.max.whileTest
 * Description: 求两个数的最大公约数
 *
 * @Author MaxSun
 * @Create 2024/1/11 20:30
 * @Version 1.0
 */
public class GreatestCommonDivisorgcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        while(num1 % num2 != 0) {
            int tmp = num1 % num2;
            num1 = num2;
            num2 = tmp;
        }
        System.out.println("最大公约数是：" + num2);
    }
}
