package com.max.domain;

import com.max.book.Book;
import com.max.book.BookList;
import com.max.util.FindBook;
import com.max.util.Uility;

/**
 * ClassName: FindOperation
 * Package: com.max.domain
 * Description: 查找图书操作类
 *
 * @Author MaxSun
 * @Create 2024/1/18 12:55
 * @Version 1.0
 */
public class FindOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书");
        System.out.print("请输入要查找图书的书名：");
        String name = Uility.getString();
        Book book = new Book(name);
        int pos = FindBook.find(bookList, book);
        book = null;
        if(pos != -1) {
            System.out.println(bookList.getBook(pos));
        } else {
            System.out.println("没有该图书");
        }
    }
}
