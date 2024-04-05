package com.max.libraryproject.service;

import com.max.libraryproject.dao.BookDao;
import com.max.libraryproject.domain.BookInfo;

import java.util.List;

/**
 * ClassName: BookService
 * Package: com.max.libraryproject.service
 * Description: 对数据进行处理
 *
 * @Author MaxSun
 * @Create 2024/4/5 08:37
 * @Version 1.0
 */
public class BookService {
    public List<BookInfo> getBookList() {
        BookDao bookDao = new BookDao();
        List<BookInfo> bookList = bookDao.mockBookList();
        for(BookInfo bookInfo : bookList) {

            if (bookInfo.getState().equals(1)) {
                bookInfo.setStateCN("可借阅");
            } else {
                bookInfo.setStateCN("已借出");
            }
        }
        return bookList;
    }
}
