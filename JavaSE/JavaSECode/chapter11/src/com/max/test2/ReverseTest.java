package com.max.test2;

/**
 * ClassName: ReverseTest
 * Package: com.max.test2
 * Description: 将一个字符串进行反转。将字符串中指定部分进行反转。比如"abcdefg"反转为"abfedcg"
 *
 * @Author MaxSun
 * @Create 2024/1/1 13:53
 * @Version 1.0
 */
public class ReverseTest {
    public static void main(String[] args) {
        String str = "abcdefg";
        System.out.println(reverseString(str, 2, 5));

    }
    public static String reverseString(String str, int begin, int end) {
        char[] charArray = str.toCharArray();
        int left = begin;
        int right = end;
        while(left < right) {
            char tmp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = tmp;
            left++;
            right--;
        }
        return new String(charArray);
    }
}
