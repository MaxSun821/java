package com.max.test4;

/**
 * ClassName: Developer
 * Package: com.max.test4
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/24 14:10
 * @Version 1.0
 */
public class Developer {
    private String name;
    private int age;

    public Developer() {
    }

    public Developer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void takingVehicle(Vehicle vehicle) {
        if(vehicle instanceof Bicycle) {
            ((Bicycle)vehicle).run();
        } else if(vehicle instanceof ElectricVehicle) {
            ((ElectricVehicle)vehicle).power();
            ((ElectricVehicle)vehicle).run();
        } else if(vehicle instanceof Car) {
            ((Car)vehicle).power();
            ((Car)vehicle).run();
        }
    }
}
