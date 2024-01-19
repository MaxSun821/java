package com.max.test;

/**
 * ClassName: Test
 * Package: com.max.test
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/1/19 21:00
 * @Version 1.0
 */
public class Test {
    public static void login() throws NameWrongException, PasswordWrongException {
        User u = new User("admin", "123");
        if(!u.getName().equals("admin")) {
            throw new NameWrongException("用户名错误");
        }
        if(!u.getPassword().equals("123456")) {
            throw new PasswordWrongException("密码错误");
        }
    }
    public static void main(String[] args) {
        try {
            login();
        } catch (NameWrongException e) {
            e.printStackTrace();
        } catch (PasswordWrongException e) {
            e.printStackTrace();
        }

    }
}
