package com.max.team.domain;

/**
 * ClassName: Architect
 * Package: com.max.team.domain
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/30 09:44
 * @Version 1.0
 */
public class Architect extends Designer{
    private int stock;

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    @Override
    public String teamString() {
        return getName() + "\t" + getAge() + "\t" + getSalary() + "\t架构师\t" + getBonus() + "\t\t" + getStock();
    }
    @Override
    public String toString() {
        return super.getString() + "\t架构师\t" + getStatus() + "\t" + getBonus() + "\t" + stock + "\t" + getEquipment().getDescription();
    }
}
