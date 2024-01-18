package com.max.user;

import com.max.book.BookList;
import com.max.domain.*;

/**
 * ClassName: AdminUser
 * Package: com.max.user
 * Description: 管理员用户类
 *
 * @Author MaxSun
 * @Create 2024/1/17 21:47
 * @Version 1.0
 */
public class AdminUser extends User{

    public AdminUser(String name) {
        super(name);
        this.iOperations = new IOperation[] {
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new ShowOperation()
        };
    }

    @Override
    public void operation() {
        System.out.println("*****************************");
        System.out.println("欢迎 " + name + " 来到图书管理系统");
        System.out.println("1. 查找图书");
        System.out.println("2. 新增图书");
        System.out.println("3. 删除图书");
        System.out.println("4. 显示图书");
        System.out.println("0. 退出系统");
        System.out.println("*****************************");
    }
    public void doWork(int choice, BookList bookList) {
        this.iOperations[choice].work(bookList);
    }
}
