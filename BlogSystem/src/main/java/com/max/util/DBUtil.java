package com.max.util;



import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * ClassName: DBUtil
 * Package: com.max.util
 * Description: 数据库连接封装类
 *
 * @Author MaxSun
 * @Create 2024/3/20 18:55
 * @Version 1.0
 */
public class DBUtil {
    private volatile static DataSource instance = null; //防止指令重排序

    private DBUtil(){
    } // 单例模式

    public static DataSource getInstance() {
        // 考虑线程安全
        if(instance == null) {
            synchronized(DBUtil.class) {
                if(instance == null) {
                    instance = new MysqlDataSource();
                    ((MysqlDataSource)instance).setUrl("jdbc:mysql://localhost:3306/java?characterEncoding=utf8&useSSL=false");
                    ((MysqlDataSource)instance).setUser("root");
                    ((MysqlDataSource)instance).setPassword("11111111");
                }
            }
        }
        return instance;
    }

    public static Connection getConnection() throws SQLException {
        // 获取连接对象
        Connection conn = getInstance().getConnection();
        return conn;
    }

    public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
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
}
