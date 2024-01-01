package com.max.test4;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: SubStringTest
 * Package: com.max.test4
 * Description:获取两个字符串中最大相同子串。比如：
 *       str1 = "abcwerthelloyuiodef";
 *       str2 = "cvhellobnm"
 *       提示：将短的那个串进行长度依次递减的子串与较长的串比较。
 *
 * @Author MaxSun
 * @Create 2024/1/1 14:37
 * @Version 1.0
 */
public class SubStringTest {
    public static void main(String[] args) {
        String str1 = "abcwerthelloyuiodef";
        String str2 = "cvhellobnm";

        List<String> maxSameSubString = getMaxSameSubString(str1, str2);
        System.out.println(maxSameSubString);


    }
    public static List<String> getMaxSameSubString(String str1, String str2) {
		if (str1 != null && str2 != null) {
			List<String> list = new ArrayList<String>();
			String maxString = (str1.length() > str2.length()) ? str1 : str2;
			String minString = (str1.length() > str2.length()) ? str2 : str1;

			int len = minString.length();
			for (int i = 0; i < len; i++) {
				for (int x = 0, y = len - i; y <= len; x++, y++) {
					String subString = minString.substring(x, y);
					if (maxString.contains(subString)) {
						list.add(subString);
					}
				}
				if (list.size() != 0) {
					break;
				}
			}
			return list;
		}

		return null;
	}

}
