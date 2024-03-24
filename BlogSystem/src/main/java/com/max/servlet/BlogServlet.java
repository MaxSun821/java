package com.max.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.max.dao.BlogDAO;
import com.max.domain.Blog;
import com.max.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;

/**
 * ClassName: BlogServlet
 * Package: com.max.servlet
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/3/22 20:17
 * @Version 1.0
 */

@WebServlet("/blog")
public class BlogServlet extends HttpServlet {

    private ObjectMapper objectMapper = new ObjectMapper();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BlogDAO blogDAO = new BlogDAO();
        String blogId = req.getParameter("blogId");
        if(blogId == null) {
            List<Blog> blogs = blogDAO.selectAll();
            String respString = objectMapper.writeValueAsString(blogs);
            resp.setContentType("application/json; charset=utf8");
            resp.getWriter().write(respString);
        } else {
            Blog blog = blogDAO.selectOne(Integer.parseInt(blogId));
            String respString = objectMapper.writeValueAsString(blog);
            resp.setContentType("application/json; charset=utf8");
            resp.getWriter().write(respString);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf8");

        String title = req.getParameter("title");
        String summary = req.getParameter("summary");
        String content = req.getParameter("content");

        if(title == null || content == null || title.equals("") || content.equals("")) {
            resp.setContentType("text/html; charset=utf8");
            resp.getWriter().write("<h3>文章标题或正文格式错误</h3>");
            return;
        }

        HttpSession session = req.getSession(false);
        if(session == null) {
            resp.setContentType("text/html; charset=utf8");
            resp.getWriter().write("<h3>当前用户未登录</h3>");
            return;
        }

        // 获取会话中的值
        User user = (User) session.getAttribute("user");
        if(user == null) {
            resp.setContentType("text/html; charset=utf8");
            resp.getWriter().write("<h3>当前用户未登录</h3>");
            return;
        }

        // 构建Blog对象
        Blog blog = new Blog();
        blog.setTitle(title);
        blog.setSummary(summary);
        blog.setContent(content);
        blog.setTime(new Timestamp(System.currentTimeMillis()));
        blog.setUserId(user.getUserId());

        // 将对象插入数据库
        BlogDAO blogDAO = new BlogDAO();
        blogDAO.insert(blog);

        resp.sendRedirect("blog_list.html");
    }
}
