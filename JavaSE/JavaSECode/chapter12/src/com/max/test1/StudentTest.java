package com.max.test1;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * ClassName: StudentTest
 * Package: com.max.test1
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/1/6 10:26
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        List<Student> slist = new ArrayList<>();
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("请录入学生信息");
            System.out.println("1：继续录入，0：结束录入");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("请输入学生姓名：");
                    String name = sc.next();
                    System.out.print("请输入学生年龄：");
                    int age = sc.nextInt();
                    Student s = new Student(name, age);
                    slist.add(s);
                    break;
                case 0:
                    flag = false;
                    break;
            }
        }while(flag);
        for (Student s : slist) {
            System.out.println(s);
        }
    }
}

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

}
