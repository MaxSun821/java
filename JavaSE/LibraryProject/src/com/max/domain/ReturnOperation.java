package com.max.domain;

import com.max.book.Book;
import com.max.book.BookList;
import com.max.util.FindBook;
import com.max.util.Uility;

/**
 * ClassName: ReturnOperation
 * Package: com.max.domain
 * Description: 归还图书操作类
 *
 * @Author MaxSun
 * @Create 2024/1/18 12:58
 * @Version 1.0
 */
public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书");
        System.out.print("请输入要归还图书的书名：");
        String name = Uility.getString();
        int pos = FindBook.find(bookList, new Book(name));
        if(pos == -1) {
            System.out.println("没有此书，归还失败");
            return;
        }
        if(!bookList.getBook(pos).isBorrowed()) {
            System.out.println("此书未借出，归还失败");
            return;
        }
        bookList.getBook(pos).setBorrowed(false);
        System.out.println("归还成功");
    }
}
