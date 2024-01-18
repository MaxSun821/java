package com.max;

import com.max.book.BookList;
import com.max.user.AdminUser;
import com.max.user.NormalUser;
import com.max.user.User;
import com.max.util.Uility;

/**
 * ClassName: Main
 * Package: com.max
 * Description: 主程序
 *
 * @Author MaxSun
 * @Create 2024/1/18 12:42
 * @Version 1.0
 */
public class Main {
    /**
     * 图书管理系统登录
     * @return 根据用户选择，1->返回管理员用户对象，0->返回普通用户对象
     */
    public static User login() {
        System.out.print("请输入你的姓名：");
        String name = Uility.getString();
        System.out.println("请输入你的身份(1->管理员 0->普通用户)：");
        int identity = Uility.getInt();

        if(identity == 1) {
            return new AdminUser(name);
        } else if(identity == 0){
            return new NormalUser(name);
        } else {
            return null;
        }
    }
    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user = login();
        while(true) {
            user.operation();
            System.out.print("请输入你的操作：");
            int choice = Uility.getInt();
            user.doWork(choice, bookList);
        }

    }
}
