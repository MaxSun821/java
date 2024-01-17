package com.max.book;

import java.util.Objects;

/**
 * ClassName: Book
 * Package: com.max.book
 * Description: 图书类，成员变量：书名、作者、价格、类型、是否被借出
 *
 * @Author MaxSun
 * @Create 2024/1/17 21:31
 * @Version 1.0
 */
public class Book {
    private String name; // 书名
    private String author; // 作者
    private double price; // 价格
    private String type; // 类型
    private boolean isBorrowed; // 判断是否被借出 false未被借出，true被借出

    public Book(String name, String author, double price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                (isBorrowed ? "借出" : "未借") +
                '}';
    }
}
