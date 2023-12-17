package com.max.test3;

/**
 * ClassName: Test
 * Package: com.max.test3
 * Description: 获取arr数组中所有元素的和
 *
 * @Author MaxSun
 * @Create 2023/12/17 11:49
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        int[][] arr = {{3,5,8},{12,9},{7,0,6,4}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                 sum += arr[i][j];
            }
        }
        System.out.println("数组中所有元素的和是：" + sum);
    }
}
