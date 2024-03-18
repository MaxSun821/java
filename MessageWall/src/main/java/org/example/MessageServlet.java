package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: MessageServlet
 * Package: org.example
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/3/18 12:32
 * @Version 1.0
 */


class Message {
    public String from;
    public String to;
    public String message;
}

@WebServlet("/message")
public class MessageServlet extends HttpServlet {
    private ObjectMapper objectMapper = new ObjectMapper();
    private List<Message> list = new ArrayList<>();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 接收新数据
        Message message = objectMapper.readValue(req.getInputStream(), Message.class);

        list.add(message);
        System.out.println("消息提交成功！");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String respString = objectMapper.writeValueAsString(list);

        resp.setContentType("application/json; charset=utf8");

        resp.getWriter().write(respString);
    }
}
