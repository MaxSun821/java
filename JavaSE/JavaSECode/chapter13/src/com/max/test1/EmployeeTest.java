package com.max.test1;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

/**
 * ClassName: EmployeeTest
 * Package: com.max.test1
 * Description: 泛型测试
 *
 * @Author MaxSun
 * @Create 2024/1/7 10:26
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        TreeSet<Employee> treeSet = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });
        treeSet.add(new Employee("zhangsan", 23, new MyDate(1998, 3, 4)));
        treeSet.add(new Employee("lisi", 24, new MyDate(1997, 2, 19)));
        treeSet.add(new Employee("wangwu", 23, new MyDate(1998, 7, 26)));
        treeSet.add(new Employee("zhaoliu", 27, new MyDate(1994, 3, 4)));
        treeSet.add(new Employee("tianqi", 23, new MyDate(1998, 4, 13)));
        System.out.println(treeSet);
    }
}
class Employee implements Comparable<Employee>{
    private String name;
    private int age;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "姓名：" + name + ", 年龄：" + age + ", 生日：" + birthday;
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }
}
class MyDate implements Comparable<MyDate>{
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public int compareTo(MyDate o) {
        if(this == o) {
            return 0;
        }
        if(this.year != o.year) {
            return this.year - o.year;
        } else if(this.year == o.year && this.month != o.month) {
            return this.month - o.month;
        } else if(this.year == o.year && this.month == o.month && this.day != o.day) {
            return this.day - o.day;
        }
        return 0;
    }
}
