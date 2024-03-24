package com.max.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.max.dao.BlogDAO;
import com.max.dao.UserDAO;
import com.max.domain.Blog;
import com.max.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName: UserServlet
 * Package: com.max.servlet
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/3/23 20:27
 * @Version 1.0
 */

@WebServlet("/user")
public class UserServlet extends HttpServlet {

    private ObjectMapper objectMapper = new ObjectMapper();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String blogId = req.getParameter("blogId");

        BlogDAO blogDAO = new BlogDAO();
        Blog blog = blogDAO.selectOne(Integer.parseInt(blogId));

        int userId = blog.getUserId();

        UserDAO userDAO = new UserDAO();

        User user = userDAO.selectByUserId(userId);
        resp.setContentType("application/json; charset=utf8");
        String respString = objectMapper.writeValueAsString(user);
        resp.getWriter().write(respString);

    }
}
