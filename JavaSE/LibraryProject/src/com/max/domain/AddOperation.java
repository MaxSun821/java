package com.max.domain;

import com.max.book.Book;
import com.max.book.BookList;
import com.max.util.FindBook;
import com.max.util.Uility;

/**
 * ClassName: AddOperation
 * Package: com.max.domain
 * Description: 新增图书操作类
 *
 * @Author MaxSun
 * @Create 2024/1/18 12:56
 * @Version 1.0
 */
public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("新增图书");
        System.out.print("请输入书名：");
        String name = Uility.getString();
        System.out.print("请输入作者：");
        String author = Uility.getString();
        System.out.print("请输入价格：");
        double price = Uility.getDouble();
        System.out.print("请输入类型：");
        String type = Uility.getString();
        Book book = new Book(name, author, price, type);
        if(FindBook.find(bookList, book) != -1) {
            // 判断该书名是否在书架中已有，若有添加失败。
            System.out.println("添加失败，该书已有");
            book = null;
            return;
        }
        int currentSize = bookList.getSize();
        bookList.setBook(book);
        bookList.setSize(currentSize + 1);
        System.out.println("新增成功");
    }
}
