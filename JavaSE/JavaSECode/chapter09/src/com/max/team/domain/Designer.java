package com.max.team.domain;

/**
 * ClassName: Designer
 * Package: com.max.team.domain
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/30 09:42
 * @Version 1.0
 */
public class Designer extends Programmer{
    private double bonus;

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String teamString() {
        return getName() + "\t" + getAge() + "\t" + getSalary() + "\t设计师\t" + getBonus();
    }
    @Override
    public String toString() {
        return super.getString() + "\t设计师\t" + getStatus() + "\t" + bonus + "\t\t\t" + getEquipment().getDescription();
    }
}
