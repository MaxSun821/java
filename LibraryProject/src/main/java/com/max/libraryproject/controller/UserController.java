package com.max.libraryproject.controller;

import com.max.libraryproject.domain.UserInfo;
import jakarta.servlet.http.HttpSession;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: UserController
 * Package: com.max.libraryproject.controller
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/4/5 08:33
 * @Version 1.0
 */

@RequestMapping("/user")
@RestController
public class UserController {

    @RequestMapping("/login")
    public boolean login(String username, String password, HttpSession session) {
        if(!StringUtils.hasLength(username) || !StringUtils.hasLength(password)) {
            return false;
        }
        if("admin".equals(username) && "admin".equals(password)) {
            UserInfo userInfo = new UserInfo();
            userInfo.setUsername(username);
            userInfo.setPassword(password);
            session.setAttribute("userInfo", userInfo);
            return true;
        }
        return false;

    }
}
