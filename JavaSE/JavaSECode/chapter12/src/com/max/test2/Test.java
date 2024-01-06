package com.max.test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * ClassName: Test
 * Package: com.max.test2
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/1/6 11:17
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 30; i++) {
            char ch = (char)(r.nextInt(26) + 97);
            list.add(ch);
        }

        int aCount = listTest(list, "a");
        int bCount = listTest(list, "b");
        int cCount = listTest(list, "c");
        int xCount = listTest(list, "x");
        System.out.println("a：" + aCount);
        System.out.println("b：" + bCount);
        System.out.println("c：" + cCount);
        System.out.println("x：" + xCount);

    }
    public static int listTest(List<Character> list, String s) {
        int count = 0;
        for(char ch : list) {
            if(ch == s.charAt(0)) {
                count++;
            }
        }
        return count;
    }
}
