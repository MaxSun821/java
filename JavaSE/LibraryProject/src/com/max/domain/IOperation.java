package com.max.domain;

import com.max.book.BookList;

/**
 * ClassName: IOperation
 * Package: com.max.domain
 * Description: 操作接口
 *
 * @Author MaxSun
 * @Create 2024/1/18 12:55
 * @Version 1.0
 */
public interface IOperation {
    /**
     * 操作都是针对书架进行操作
     * @param bookList 书架类对象
     */
    void work(BookList bookList);
}
