package com.max.domain;

import com.max.book.Book;
import com.max.book.BookList;
import com.max.util.FindBook;
import com.max.util.Uility;

/**
 * ClassName: DelOperation
 * Package: com.max.domain
 * Description: 删除图书操作类
 *
 * @Author MaxSun
 * @Create 2024/1/18 13:07
 * @Version 1.0
 */
public class DelOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        System.out.print("请输入要删除图书的书名：");
        String name = Uility.getString();
        int pos = FindBook.find(bookList, new Book(name));
        if(pos == -1) {
            System.out.println("没有此书，删除失败");
            return;
        }
        int currentSize = bookList.getSize();
        for (int i = pos; i < bookList.getSize() - 1; i++) {
            // 向前覆盖
            bookList.setBook(i, bookList.getBook(i + 1));
        }
        bookList.setSize(currentSize - 1);
        System.out.println("删除成功");
    }
}
