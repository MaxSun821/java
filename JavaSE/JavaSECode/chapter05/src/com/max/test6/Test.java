package com.max.test6;

/**
 * ClassName: Test
 * Package: com.max.test6
 * Description: 评委打分
 *
 * @Author MaxSun
 * @Create 2023/12/17 12:12
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {5,4,6,8,9,0,1,2,7,3};
        double avg = 0.0;
        int max = 0;
        int min = arr[0];
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
            if(min > arr[i]) {
                min = arr[i];
            }
            sum += arr[i];
        }
        avg = (sum - max - min) / 8;
        System.out.println("选手得分：" + avg);
    }
}
