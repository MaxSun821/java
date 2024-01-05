package com.max.test6;


import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * ClassName: DateTest
 * Package: com.max.test6
 * Description:api类测试
 *
 * @Author MaxSun
 * @Create 2024/1/5 12:17
 * @Version 1.0
 */
public class DateTest {
//    public static void main(String[] args) {
//        Date d = new Date();
//        long millisTime = d.getTime();
//        java.sql.Date date = new java.sql.Date(millisTime);
//        System.out.println(date);
//    }
    @Test
    public void test1() {
        // 将java.util.Date实例转换成java.sql.Date实例
        Date d = new Date();
        long millisTime = d.getTime();
        java.sql.Date date = new java.sql.Date(millisTime);
        System.out.println(date);
    }

    @Test
    public void test2() {
        // 使用Calendar获取当前时间, 把这个时间设置为你的生日, 再获取你的百天(出生后100天)日期。
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 100);
        Date date = calendar.getTime();
        System.out.println(date);

        // 使用LocalDateTime获取当前时间, 把这个时间设置为你的生日, 再获取你的百天(出生后100天)日期。
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = localDateTime.plusDays(100);
        System.out.println(localDateTime1);
    }
}
