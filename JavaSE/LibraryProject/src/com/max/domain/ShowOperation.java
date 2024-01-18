package com.max.domain;

import com.max.book.BookList;

/**
 * ClassName: ShowOperation
 * Package: com.max.domain
 * Description: 显示所有图书操作类
 *
 * @Author MaxSun
 * @Create 2024/1/18 12:57
 * @Version 1.0
 */
public class ShowOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        for (int i = 0; i < bookList.getSize(); i++) {
            System.out.println(bookList.getBook(i));
        }
    }
}
