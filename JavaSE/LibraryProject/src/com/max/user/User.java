package com.max.user;

import com.max.book.BookList;
import com.max.domain.IOperation;

/**
 * ClassName: User
 * Package: com.max.user
 * Description: 用户类
 *
 * @Author MaxSun
 * @Create 2024/1/17 21:46
 * @Version 1.0
 */
public abstract class User {
    protected String name; // 用户名
    protected IOperation[] iOperations; // 操作方法数组

    public User(String name) {
        this.name = name;
    }

    public abstract void operation();
    public abstract void doWork(int choice, BookList bookList);
}
