import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // int x = 4;
        // int y = 1;
        // if (x > 2) {
        //     if (y > 2) 
        //         System.out.println(x + y);
        //     System.out.println("atguigu");
        // } else
        //     System.out.println("x is " + x);

        // int small = 10;
        // int big = 5;

        // if(small > big) {
        //     int tmp = small;
        //     small = big;
        //     big = tmp;
        // }
        // System.out.println("small = " + small + ", big = " + big);

        // int score = 49;
        // if(score < 0 || score > 100) {
        //     System.out.println("成绩错误");
        // }else if(score >= 90) {
        //     System.out.println("优秀");
        // }else if(score >= 80) {
        //     System.out.println("好");
        // }else if(score >= 70) {
        //     System.out.println("良");
        // }else if(score >= 60) {
        //     System.out.println("及格");
        // }else {
        //     System.out.println("不及格");
        // }

        // int a = 20;
        // int b = 42;

        // if(a + b >= 50) {
        //     System.out.println("hello world!");
        // }

        // double num1 = 12.4;
        // double num2 = 35.2;
        // if(num1 > 10.0 && num2 > 20.0) {
        //     System.out.println(num1 + num2);
        // }else {
        //     System.out.println(num1 * num2);
        // }

        // int waterTemp = 65;
        // if(waterTemp > 95) {
        //     System.out.println("开水");
        // }else if(waterTemp > 70) {
        //     System.out.println("热水");
        // }else if(waterTemp > 40) {
        //     System.out.println("温水");
        // }else {
        //     System.out.println("凉水");
        // }

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入星期：");
        int weekday = sc.nextInt();
        
        switch(weekday) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("星期有误");
            break;
        }


    }
}