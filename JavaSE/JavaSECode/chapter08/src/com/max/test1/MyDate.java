package com.max.test1;

/**
 * ClassName: MyDate
 * Package: com.max.test1
 * Description: 日期类
 *
 * @Author MaxSun
 * @Create 2023/12/23 14:34
 * @Version 1.0
 */
public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    @Override
    public String toString() {
        return year + "年" + month + "月" + day + "日";
    }
}
