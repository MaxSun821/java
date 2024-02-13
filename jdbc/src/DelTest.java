import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * ClassName: DelTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/2/13 14:29
 * @Version 1.0
 */
public class DelTest {
    public static int del() {
        Connection conn = null;
        PreparedStatement ps = null;
        Scanner sc = new Scanner(System.in);
        int ret = 0;
        try {
            // 建立连接
            conn = Unity.getConnection();
            String sql = "delete from student where id = ?";
            System.out.print("请输入要删除的学号: ");
            int id = sc.nextInt();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ret = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(ps != null) {
                    ps.close();
                }
                if(conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return ret;
        }
    }
}
