package com.max.libraryproject.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * ClassName: BookInfo
 * Package: com.max.libraryproject
 * Description: 图书类
 *
 * @Author MaxSun
 * @Create 2024/4/4 14:20
 * @Version 1.0
 */

@Data
public class BookInfo {
    private Integer bookId;
    private String bookName;
    private String author;
    private Integer count;
    private BigDecimal price;
    private String publish;
    private Integer state;
    private String stateCN;
}
