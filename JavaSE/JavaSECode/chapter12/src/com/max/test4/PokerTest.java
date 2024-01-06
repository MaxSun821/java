package com.max.test4;

import java.util.*;

/**
 * ClassName: PokerTest
 * Package: com.max.test4
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/1/6 16:15
 * @Version 1.0
 */
public class PokerTest {
    public static void main(String[] args) {
        String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] color = {"方片♦","梅花♣","红桃♥","黑桃♠"};

        List<String> poker = getPoker(num, color);

        Collections.shuffle(poker); // 洗牌

        List<String> tomPlayer = new ArrayList<>();
        List<String> jerryPlayer = new ArrayList<>();
        List<String> mePlayer = new ArrayList<>();
        List<String> sub = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            if(i >= poker.size() - 3) {
                sub.add(poker.get(i));
            } else if(i % 3 == 0) {
                tomPlayer.add(poker.get(i));
            } else if(i % 3 == 1) {
                jerryPlayer.add(poker.get(i));
            } else if(i % 3 == 2){
                mePlayer.add(poker.get(i));
            }
        }

        System.out.println("Tom:");
        System.out.println(tomPlayer);
        System.out.println("Jerry:");
        System.out.println(jerryPlayer);
        System.out.println("me:");
        System.out.println(mePlayer);
        System.out.println("底牌:");
        System.out.println(sub);
    }

    /**
     * 准备扑克的方法
     * @param num 扑克的数字
     * @param color 扑克的颜色
     * @return 一副扑克所有牌的集合
     */
    public static List<String> getPoker(String[] num, String[] color) {
        List<String> poker = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < color.length; j++) {
                poker.add(color[j] + num[i]);
            }
        }
        poker.add("大王");
        poker.add("小王");
        return poker;
    }

}

