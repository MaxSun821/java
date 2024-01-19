package com.max.test;

/**
 * ClassName: PasswordWrongException
 * Package: com.max.test
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/1/19 21:03
 * @Version 1.0
 */
public class PasswordWrongException extends Exception{
    public PasswordWrongException() {
    }

    public PasswordWrongException(String message) {
        super(message);
    }
}
