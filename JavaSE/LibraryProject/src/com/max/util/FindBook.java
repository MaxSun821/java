package com.max.util;

import com.max.book.Book;
import com.max.book.BookList;

/**
 * ClassName: FindBook
 * Package: com.max.util
 * Description: 查找图书工具类
 *
 * @Author MaxSun
 * @Create 2024/1/18 13:17
 * @Version 1.0
 */
public class FindBook {
    public static int find(BookList bookList, Book book) {
        for (int i = 0; i < bookList.getSize(); i++) {
            if(bookList.getBook(i).equals(book)) {
                return i;
            }
        }
        return -1;
    }
}
