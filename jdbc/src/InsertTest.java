import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * ClassName: InsertTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/2/13 14:17
 * @Version 1.0
 */
public class InsertTest {
    public static int insert() {
        Connection conn = null;
        PreparedStatement ps = null;
        Scanner sc = new Scanner(System.in);
        int ret = 0;
        try {
            // 建立连接
            conn = Unity.getConnection();
            String sql = "insert into student values(?,?)";
            System.out.print("请输入学号: ");
            int id = sc.nextInt();
            System.out.print("请输入姓名: ");
            String name = sc.next();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, name);
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
