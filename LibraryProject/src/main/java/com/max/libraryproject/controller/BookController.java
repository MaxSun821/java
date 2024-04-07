package com.max.libraryproject.controller;

import com.max.libraryproject.dao.BookDao;
import com.max.libraryproject.domain.BookInfo;
import com.max.libraryproject.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName: LoginController
 * Package: com.max.libraryproject
 * Description: 登录后端接口
 *
 * @Author MaxSun
 * @Create 2024/4/4 12:07
 * @Version 1.0
 */
@RequestMapping("/book")
@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @RequestMapping("/getList")
    public List<BookInfo> getList() {
        List<BookInfo> bookList = bookService.getBookList();
        return bookList;
    }
}
