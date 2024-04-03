package org.example.springbootdemo;

import jakarta.servlet.http.HttpSession;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: LoginController
 * Package: org.example.springbootdemo
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/4/3 19:12
 * @Version 1.0
 */

@RequestMapping("/user")
@RestController
public class LoginController {
    @RequestMapping("/login")
    public boolean login(String username, String password, HttpSession session) {
        // 判断用户名和密码是否正确
        if(!StringUtils.hasLength(username) || !StringUtils.hasLength(password)) {
            return false;
        }
        if("admin".equals(username) && "123456".equals(password)) {
            // 用户密码正确，将用户名存入session
            session.setAttribute("username", username);
            return true;
        }
        return false;
    }
    @RequestMapping("/index")
    public String index(HttpSession session) {
        String username = (String)session.getAttribute("username");
        return username;
    }
}
