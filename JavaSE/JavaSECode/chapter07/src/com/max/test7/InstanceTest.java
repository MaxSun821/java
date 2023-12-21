package com.max.test7;

/**
 * ClassName: InstanceTest
 * Package: com.max.test7
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/21 13:06
 * @Version 1.0
 */
public class InstanceTest {
    public static void main(String[] args) {
        InstanceTest instanceTest = new InstanceTest();
        instanceTest.method(new Person());
        instanceTest.method(new Student());
        instanceTest.method(new Graduate());
    }
    public void method(Person e) {
        if(e instanceof Person) {
            System.out.println(e.getInfo());
            System.out.println("a person");
        } else if(e instanceof Student) {
            System.out.println(((Student) e).getInfo());
            System.out.println("a student");
            System.out.println("a person");
        } else if(e instanceof Graduate) {
            System.out.println(((Graduate) e).getInfo());
            System.out.println("a graduated student");
            System.out.println("a student");
            System.out.println("a person");
        }
    }
}
class Person {
    protected String name="person";
    protected int age=50;
    public String getInfo() {
        return "Name: "+ name + "\n" +"age: "+ age;
    }
}
class Student extends Person {
    protected String school="pku";
    public String getInfo() {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school;
    }
}
class Graduate extends Student{
    public String major="IT";
    public String getInfo()
    {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school+"\nmajor:"+major;
    }
}
