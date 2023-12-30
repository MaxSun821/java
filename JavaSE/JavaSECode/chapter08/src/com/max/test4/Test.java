package com.max.test4;

/**
 * ClassName: Test
 * Package: com.max.test4
 * Description: 测试类
 *
 * @Author MaxSun
 * @Create 2023/12/24 14:23
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Bicycle("捷安特", "黑色");
        vehicles[1] = new ElectricVehicle("雅迪", "绿色");
        vehicles[2] = new Car("奔驰", "红色", "123456");
        Developer d = new Developer();
        for (int i = 0; i < 3; i++) {
            d.takingVehicle(vehicles[i]);
        }
    }
}
