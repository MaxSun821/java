package com.max.team.domain;

/**
 * ClassName: Programmer
 * Package: com.max.team.domain
 * Description:
 *
 * @Author MaxSun
 * @Create 2023/12/30 09:32
 * @Version 1.0
 */
public class Programmer extends Employee{
    private int memberId;
    private Status status = Status.FREE;
    private Equipment equipment;

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public String teamString() {
        return getName() + "\t" + getAge() + "\t" + getSalary() + "\t程序员\t";
    }

    @Override
    public String toString() {
        return super.getString() + "\t程序员\t" + status + "\t\t\t\t\t" + equipment.getDescription();
    }
}
