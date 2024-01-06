package com.max.test3;

import java.util.*;

/**
 * ClassName: SetTest
 * Package: com.max.test3
 * Description: 去掉List中的重复元素
 * 获取10个1至20的随机数，要求随机数不能重复。并把最终的随机数输出到控制台。
 *
 * @Author MaxSun
 * @Create 2024/1/6 14:53
 * @Version 1.0
 */
public class SetTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(5);

        List<Integer> list1 = duplicateList(list);

        Random r = new Random();
        Set<Integer> set = new HashSet<>();
        while(set.size() <= 10) {
            int tmp = r.nextInt(20) + 1;
            set.add(tmp);
        }
        System.out.println(set.toString());
    }
    public static List<Integer> duplicateList(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        List<Integer> list1 = new ArrayList<>(set);
        return list1;
    }
}
