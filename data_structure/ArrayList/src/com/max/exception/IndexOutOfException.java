package com.max.exception;

/**
 * ClassName: IndexOutOfException
 * Package: com.max.exception
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/1/23 12:27
 * @Version 1.0
 */
public class IndexOutOfException extends RuntimeException{
    public IndexOutOfException() {}
    public IndexOutOfException(String message) {
        super(message);
    }
}
