package com.max.test5;

/**
 * ClassName: Test
 * Package: com.max.test5
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/1/7 12:04
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Student<String> stu1 = new Student<>("zhangsan", "优秀");
        Student<Double> stu2 = new Student<>("lisi", 89.5);
        Student<Character> stu3 = new Student<>("wangwu", 'A');
    }
}
class Student<T> {
    private String name;
    private T score;

    public Student() {
    }

    public Student(String name, T score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getScore() {
        return score;
    }

    public void setScore(T score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
