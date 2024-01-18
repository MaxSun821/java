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
    private static final int DEFAULT_SIZE = 10; // books数组初识容量
    private Book[] books; // 书对象存放的数组
    private int size; // books数组中书的数量
    private int capacity; // 数组容量

    public BookList() {
        capacity = DEFAULT_SIZE;
        books = new Book[capacity];
        books[0] = new Book("三国演义" , "罗贯中", 28.0, "小说");
        books[1] = new Book("红楼梦" , "曹雪芹", 43.0, "小说");
        books[2] = new Book("西游记" , "吴承恩", 50.0, "小说");
        books[3] = new Book("水浒传" , "施耐庵", 32.0, "小说");
        size = 4;
    }
    public Book getBook(int pos) {
        if(pos < size) {
            return books[pos];
        }
        return null;
    }
    public void setBook(Book book) {
        if(!isFull()) {
            books[size] = book;
        } else {
            System.out.println("书架已满，无法添加");
        }
    }
    public void setBook(int pos, Book book) {
        if(!isFull()) {
            books[pos] = book;
        } else {
            System.out.println("书架已满，无法添加");
        }
    }


    /**
     * 判断books数组是否已满。
     * @return true->数组已满，false->数组未满
     */
    private boolean isFull() {
        if(size == capacity) {
            return true;
        }
        return false;
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
