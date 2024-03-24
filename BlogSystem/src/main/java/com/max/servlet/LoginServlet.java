package com.max.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.max.dao.UserDAO;
import com.max.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * ClassName: LoginServlet
 * Package: com.max.servlet
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/3/23 19:24
 * @Version 1.0
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private ObjectMapper objectMapper = new ObjectMapper();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf8");

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        resp.setContentType("text/html; charset=utf8");

        if(username == null || password == null || username.equals("") || password.equals("")) {
            resp.getWriter().write("用户名或密码错误");
            return;
        }

        UserDAO userDAO = new UserDAO();
        User user = userDAO.selectByName(username);

        if(user == null) {
            resp.getWriter().write("用户名或密码错误");
            return;
        }

        HttpSession session = req.getSession(true);
        session.setAttribute("user", user);

        resp.sendRedirect("blog_list.html");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        if(session == null) {
            // 会话不存在，肯定没有登录
            resp.setStatus(403);
            return;
        }
        User user = (User) session.getAttribute("user");
        if(user == null) {
            // 用户不存在，肯定没登录
            resp.setStatus(403);
            return;
        }
        resp.setContentType("application/json;charset=utf8");
        user.setPassword("");
        String respString = objectMapper.writeValueAsString(user);
        resp.getWriter().write(respString);
        resp.setStatus(200);
    }
}
