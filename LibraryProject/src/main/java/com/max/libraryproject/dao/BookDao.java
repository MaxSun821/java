package com.max.libraryproject.dao;

import com.max.libraryproject.domain.BookInfo;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * ClassName: BookDao
 * Package: com.max.libraryproject.dao
 * Description: 图书操作
 *
 * @Author MaxSun
 * @Create 2024/4/5 08:24
 * @Version 1.0
 */

@Repository
public class BookDao {
    public List<BookInfo> mockBookList() {
        List<BookInfo> bookList = new ArrayList<>();
        for (int i = 1; i <= 15; i++) {
            BookInfo bookInfo = new BookInfo();
            bookInfo.setBookId(i);
            bookInfo.setBookName("我是书名" + i);
            bookInfo.setAuthor("我是作者" + i);
            bookInfo.setCount(i * 12 + 2);
            bookInfo.setPrice(new BigDecimal(new Random().nextInt(100) + 1));
            bookInfo.setPublish("我是出版社" + i);
            bookInfo.setState((i % 6 == 1 ? 2 : 1));
            bookList.add(bookInfo);
        }
        return bookList;
    }
}
