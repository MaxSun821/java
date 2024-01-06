package com.max.test3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ClassName: SetTest
 * Package: com.max.test3
 * Description: 去掉List中的重复元素
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
    }
    public static List<Integer> duplicateList(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set.toString());
        List<Integer> list1 = new ArrayList<>(set);
        return list1;
    }
}
