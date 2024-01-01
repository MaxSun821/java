package com.max.test3;

/**
 * ClassName: SubStringCountTest
 * Package: com.max.test3
 * Description:获取一个字符串在另一个字符串中出现的次数。
 *       比如：获取"ab"在 "abkkcadkabkebfkabkskab" 中出现的次数
 *
 * @Author MaxSun
 * @Create 2024/1/1 13:59
 * @Version 1.0
 */
public class SubStringCountTest {
    public static void main(String[] args) {
        System.out.println(subStrCount("abkkcadkabkebfkabkskab", "ab"));
    }
    public static int subStrCount(String str, String subStr) {
        int count = 0;
        int index = str.indexOf(subStr);

        while(index >= 0) {
            count++;
            index = str.indexOf(subStr, index + subStr.length());
        }
        return count;
    }
}
