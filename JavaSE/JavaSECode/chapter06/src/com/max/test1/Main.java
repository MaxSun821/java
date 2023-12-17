package com.max.test1;

/**
 * ClassName: Main
 * Package: com.max.test1
 * Description: 测试类
 *
 * @Author MaxSun
 * @Create 2023/12/17 15:35
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("110", "张三", 23, 5000.0);
        Employee e2 = new Employee("111", "李四", 24, 6000.0);

        System.out.println("员工1的" + e1.toString());
        System.out.println("员工2的" + e2.toString());
    }
}
