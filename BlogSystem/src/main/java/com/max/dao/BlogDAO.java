package com.max.dao;

import com.max.domain.Blog;
import com.max.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: BlogDao
 * Package: com.max.dao
 * Description: 对数据库博客表的操作封装
 *
 * @Author MaxSun
 * @Create 2024/3/20 19:21
 * @Version 1.0
 */
public class BlogDAO {
    // 在数据库中插入博客
    public void insert(Blog blog) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = DBUtil.getConnection();
            String sql = "insert into blog values(null, ?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, blog.getTitle());
            ps.setString(2, blog.getSummary());
            ps.setString(3, blog.getContent());
            ps.setString(4, blog.getTime());
            ps.setInt(5, blog.getUserId());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn, ps, null);
        }
    }

    // 查找数据库中所有博客
    public List<Blog> selectAll() {
        List<Blog> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection();
            String sql = "select * from blog order by blogId desc";
            ps = conn.prepareStatement(sql);

            rs = ps.executeQuery();
            while(rs.next()) {
                Blog blog = new Blog();
                blog.setBlogId(rs.getInt("blogId"));
                blog.setTitle(rs.getString("title"));
                blog.setSummary(rs.getString("summary"));
                blog.setContent(rs.getString("content"));
                blog.setTime(rs.getTimestamp("time"));
                blog.setUserId(rs.getInt("userId"));

                list.add(blog);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn, ps, rs);
        }
        return list;
    }

    // 按照blogId查找博客
    public Blog selectOne(int blogId) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Blog blog = null;
        try {
            conn = DBUtil.getConnection();
            String sql = "select * from blog where blogId = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, blogId);

            rs = ps.executeQuery();
            // 按照blogId查询，至多有一条数据，因此此处用if判断即可

            if(rs.next()) {
                blog = new Blog();
                blog.setBlogId(rs.getInt("blogId"));
                blog.setTitle(rs.getString("title"));
                blog.setSummary(rs.getString("summary"));
                blog.setContent(rs.getString("content"));
                blog.setTime(rs.getTimestamp("time"));
                blog.setUserId(rs.getInt("userId"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn, ps, rs);
        }
        return blog;
    }

    public void deleteBlog(int blogId) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = DBUtil.getConnection();
            String sql = "delete from blog where blogId = ?";

            ps = conn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn, ps, null);
        }
    }
}
