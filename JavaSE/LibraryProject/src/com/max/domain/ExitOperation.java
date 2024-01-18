package com.max.domain;

import com.max.book.BookList;
import com.max.util.Uility;

/**
 * ClassName: ExitOperation
 * Package: com.max.domain
 * Description: 退出系统操作类
 *
 * @Author MaxSun
 * @Create 2024/1/18 12:54
 * @Version 1.0
 */
public class ExitOperation implements IOperation{
    public void work(BookList bookList) {
        System.out.println("退出系统");
        Uility.getClose();
        System.exit(0);
    }
}
