package com.max.test6;

/**
 * ClassName: Main
 * Package: com.max.test6
 * Description: 测试类
 *
 * @Author MaxSun
 * @Create 2023/12/18 13:05
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {7,4,0,1,3,2,50,42,16,78,35};
        ArrayUtil arrayUtil = new ArrayUtil();

        arrayUtil.sort(arr, 0, arr.length - 1);
        int max = arrayUtil.max(arr);
        System.out.println("最大值是：" + max);

        arrayUtil.print(arr);
    }
}
