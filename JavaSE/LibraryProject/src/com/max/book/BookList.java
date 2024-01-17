package com.max.book;

/**
 * ClassName: BookList
 * Package: com.max.book
 * Description: 书架类，可以存放若干本书
 *
 * @Author MaxSun
 * @Create 2024/1/17 21:39
 * @Version 1.0
 */
public class BookList {
    private Book[] books;
    private int size;
    private int capacity;

    public BookList() {
        capacity = 10;
        books = new Book[capacity];
        books[0] = new Book("三国演义" , "罗贯中", 28.0, "小说");
        books[1] = new Book("红楼梦" , "曹雪芹", 43.0, "小说");
        books[2] = new Book("西游记" , "吴承恩", 50.0, "小说");
        books[3] = new Book("水浒传" , "施耐庵", 32.0, "小说");
        size = 4;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
