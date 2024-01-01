package com.max.test1;

/**
 * ClassName: TrimTest
 * Package: com.max.test1
 * Description: 模拟一个trim方法，去除字符串两端的空格。
 *
 * @Author MaxSun
 * @Create 2024/1/1 11:30
 * @Version 1.0
 */
public class TrimTest {
    private String str;
    public TrimTest(String str) {
        this.str = str;
    }
    public String myTrim() {
        int right = str.length() - 1;
        int left = 0;
        char[] charArray = str.toCharArray();
        while(left < right && charArray[left] == ' ') {
            left++;
        }
        while(left < right && charArray[right] == ' ') {
            right--;
        }
        String newStr = new String(charArray, left, right - left + 1);
        return newStr;

    }
    public static void main(String[] args) {
//        String str = "   hello    world      ";
//        System.out.println(str);
//        System.out.println(str.trim());

        TrimTest str = new TrimTest("   HELLO WORLD   ");
        System.out.println(str.myTrim());

    }
}
