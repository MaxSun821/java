package com.max.test4;

/**
 * ClassName: Test
 * Package: com.max.test4
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/1/7 11:21
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        String[] strs = {"aa", "bb", "cc", "dd", "ee"};
//        method1(strs, 0, 3);
//        for (String str : strs) {
//            System.out.print(str + " ");
//        }
        method2(strs);
        for (String str : strs) {
            System.out.print(str + " ");
        }
    }
    public static <E> void method1(E[] e, int a, int b) {
        E tmp = e[a];
        e[a] = e[b];
        e[b] = tmp;
    }
    public static <E> void method2(E[] e) {
        int left = 0;
        int right = e.length - 1;
        while(left < right) {
            method1(e, left, right);
            left++;
            right--;
        }
    }
}
