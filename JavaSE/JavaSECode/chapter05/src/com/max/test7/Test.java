package com.max.test7;

/**
 * ClassName: Test
 * Package: com.max.test7
 * Description: 杨辉三角
 *
 * @Author MaxSun
 * @Create 2023/12/17 12:16
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                if(j == i || j == 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

    }
}
