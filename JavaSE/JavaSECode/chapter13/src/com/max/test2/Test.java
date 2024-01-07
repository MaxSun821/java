package com.max.test2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

/**
 * ClassName: Test
 * Package: com.max.test2
 * Description: Predicate接口
 *
 * @Author MaxSun
 * @Create 2024/1/7 10:40
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            list.add(r.nextInt(100));
        }
        for(int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        list.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        });
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
