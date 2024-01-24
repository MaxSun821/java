package com.max.exception;

/**
 * ClassName: IndexOutOfException
 * Package: com.max.exception
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/1/24 21:20
 * @Version 1.0
 */
public class IndexOutOfException extends RuntimeException{
    public IndexOutOfException() {
    }

    public IndexOutOfException(String message) {
        super(message);
    }
}
