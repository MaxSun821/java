package com.max.test;

/**
 * ClassName: NameWrongException
 * Package: com.max.test
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/1/19 21:02
 * @Version 1.0
 */
public class NameWrongException extends Exception{
    public NameWrongException() {
    }

    public NameWrongException(String message) {
        super(message);
    }
}
