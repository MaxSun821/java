package com.max.libraryproject.service;

import com.max.libraryproject.dao.BookDao;
import com.max.libraryproject.domain.BookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

@Service
public class BookService {
    @Autowired
    private BookDao bookDao;


    public List<BookInfo> getBookList() {
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
