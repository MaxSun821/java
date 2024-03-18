package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * ClassName: LoginServlet
 * Package: org.example
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/3/18 20:32
 * @Version 1.0
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        // 验证用户名密码正确性
        if(username == null || password == null || username.equals("")) {
            resp.setContentType("text/html; charset=utf8");
            resp.getWriter().write("用户名或密码错误");
            return;
        }

        if(!username.equals("admin") && !username.equals("zhangsan")) {
            resp.setContentType("text/html; charset=utf8");
            resp.getWriter().write("用户名或密码错误");
            return;
        }

        if(!password.equals("123")) {
            resp.setContentType("text/html; charset=utf8");
            resp.getWriter().write("用户名或密码错误");
            return;
        }

        // 用户名密码正确
        HttpSession session = req.getSession(true);
        session.setAttribute("count", 0);
        session.setAttribute("username", username);

        resp.sendRedirect("index");
    }
}
