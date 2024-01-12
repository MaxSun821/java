package com.max.recursion;

/**
 * ClassName: HanoiTest
 * Package: com.max.recursion
 * Description: 递归求解汉诺塔问题
 *
 * @Author MaxSun
 * @Create 2024/1/12 21:20
 * @Version 1.0
 */
public class HanoiTest {
    public static void main(String[] args) {
        hanoi(4, 'A', 'B', 'C');
    }

    /**
     * 汉诺塔实现方法
     * @param n 塔数
     * @param c1 起始位置
     * @param c2 中转位置
     * @param c3 结束位置
     */
    public static void hanoi(int n, char c1, char c2, char c3) {
        if(n == 1) {
            move(n, c1, c3);
            return;
        }
        hanoi(n - 1, c1, c3, c2);
        move(n, c1, c3);
        hanoi(n - 1, c2, c1, c3);
    }

    /**
     * 移动方法
     * @param n 塔的编号
     * @param c1 起始位置
     * @param c2 移动到的位置
     */
    public static void move(int n, char c1, char c2) {
        System.out.println(n + ":" + c1 + "->" + c2);
    }
}
