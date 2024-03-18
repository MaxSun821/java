package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    //private List<Message> list = new ArrayList<>();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 接收新数据
        Message message = objectMapper.readValue(req.getInputStream(), Message.class);

        save(message);
        System.out.println("消息提交成功！");
    }



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Message> list = load();

        String respString = objectMapper.writeValueAsString(list);

        resp.setContentType("application/json; charset=utf8");

        resp.getWriter().write(respString);
    }

    private void save(Message message) {
        // 连接数据库
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/java?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("111111");


        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = dataSource.getConnection();
            String sql = "insert into message values(?, ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, message.from);
            ps.setString(2, message.to);
            ps.setString(3, message.message);

            int i = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    private List<Message> load() {
        List<Message> list = new ArrayList<>();
        // 连接数据库
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/java?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("111111");


        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = dataSource.getConnection();
            String sql = "select * from message";
            ps = conn.prepareStatement(sql);

            rs = ps.executeQuery();

            while(rs.next()) {
                Message message = new Message();
                message.from = rs.getString("from");
                message.to = rs.getString("to");
                message.message = rs.getString("message");

                list.add(message);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
}
