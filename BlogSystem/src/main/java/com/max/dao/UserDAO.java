package com.max.dao;

import com.max.domain.User;
import com.max.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * ClassName: UserDAO
 * Package: com.max.dao
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/3/22 19:53
 * @Version 1.0
 */
public class UserDAO {
    public User selectByUserId(int userId) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User user = null;
        try {
            conn = DBUtil.getConnection();
            String sql = "select * from user where userId = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, userId);

            rs = ps.executeQuery();
            // 按照blogId查询，至多有一条数据，因此此处用if判断即可

            if(rs.next()) {
                user = new User();
                user.setUserId(rs.getInt("userId"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setImage(rs.getString("image"));
                user.setGithub(rs.getString("github"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn, ps, rs);
        }
        return user;
    }

    public User selectByName(String username) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User user = null;
        try {
            conn = DBUtil.getConnection();
            String sql = "select * from user where username = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, username);

            rs = ps.executeQuery();
            // 按照blogId查询，至多有一条数据，因此此处用if判断即可

            if(rs.next()) {
                user = new User();
                user.setUserId(rs.getInt("userId"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setImage(rs.getString("image"));
                user.setGithub(rs.getString("github"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn, ps, rs);
        }
        return user;
    }
}
