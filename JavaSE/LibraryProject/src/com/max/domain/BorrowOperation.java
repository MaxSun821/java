package com.max.domain;

import com.max.book.Book;
import com.max.book.BookList;
import com.max.util.FindBook;
import com.max.util.Uility;

/**
 * ClassName: BorrowOperation
 * Package: com.max.domain
 * Description: 借阅图书操作类
 *
 * @Author MaxSun
 * @Create 2024/1/18 12:57
 * @Version 1.0
 */
public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书");
        System.out.print("请输入要借阅图书的书名：");
        String name = Uility.getString();
        int pos = FindBook.find(bookList, new Book(name));
        if(pos == -1) {
            System.out.println("没有此书，借阅失败");
            return;
        }
        if(bookList.getBook(pos).isBorrowed()) {
            System.out.println("此书已被借出，借阅失败");
            return;
        }
        bookList.getBook(pos).setBorrowed(true);
        System.out.println("借阅成功");
    }
}
