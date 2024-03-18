package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * ClassName: IndexServlet
 * Package: org.example
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/3/18 20:41
 * @Version 1.0
 */

@WebServlet("/index")
public class IndexServlet extends HelloServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        int count = (int)session.getAttribute("count");

        count += 1;
        session.setAttribute("count", count);
        resp.setContentType("text/html; charset=utf8");

        resp.getWriter().write("<h1>访问次数为" + count + "</h1>");

    }
}
