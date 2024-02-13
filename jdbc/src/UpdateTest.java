import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * ClassName: UpdateTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/2/13 14:32
 * @Version 1.0
 */
public class UpdateTest {
    public static int update() {
        Connection conn = null;
        PreparedStatement ps = null;
        Scanner sc = new Scanner(System.in);
        int ret = 0;
        try {
            // 建立连接
            conn = Unity.getConnection();
            String sql = "update student set name = ? where id = ?";
            System.out.print("请输入要修改的学号: ");
            int id = sc.nextInt();
            System.out.print("请输入修改的姓名: ");
            String name = sc.next();
            ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2, id);
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
