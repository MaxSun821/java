/**
 * ClassName: Test
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/2/13 14:15
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        int count = 3;
        int ret = 0;

        while(count != 0) {
            ret = InsertTest.insert();
            if(ret != 0) {
                System.out.println("插入成功");
            }
            count--;
        }


        ret = DelTest.del();
        if(ret != 0) {
            System.out.println("删除成功");
        }
        ret = UpdateTest.update();
        if(ret != 0) {
            System.out.println("修改成功");
        }

        SelectTest.select();
    }
}
